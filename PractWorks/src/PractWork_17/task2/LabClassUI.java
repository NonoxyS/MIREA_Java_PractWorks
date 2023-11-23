package PractWork_17.task2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Stack;

public class LabClassUI<T> extends JFrame {
    private LabClass<T> labClass;
    private DefaultTableModel model;
    private JTable table;
    private JTextField searchTextField;

    private JTextField studentNameField;
    private JTextField studentIdField;
    private JTextField studentRollField;

    public LabClassUI(T id) {
        this.labClass = new LabClass<>(id);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Имя", "ID", "Средний балл"};
        model = new DefaultTableModel(null, columnNames);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JButton sortButton = new JButton("Сортировать по баллам");
        sortButton.addActionListener(this::sortStudentsByRoll);

        searchTextField = new JTextField(20);
        JButton searchButton = new JButton("Поиск");
        searchButton.addActionListener(this::searchStudentByName);

        JPanel controlPanel = new JPanel();
        controlPanel.add(sortButton);
        controlPanel.add(searchTextField);
        controlPanel.add(searchButton);

        JButton addButton = new JButton("Добавить");
        studentNameField = new JTextField(20);
        studentIdField = new JTextField(20);
        studentRollField = new JTextField(20);

        addButton.addActionListener(this::addStudent);

        JPanel addStudentPanel = new JPanel();
        addStudentPanel.add(new JLabel("Имя: "));
        addStudentPanel.add(studentNameField);
        addStudentPanel.add(new JLabel("ID: "));
        addStudentPanel.add(studentIdField);
        addStudentPanel.add(new JLabel("Средний балл: "));
        addStudentPanel.add(studentRollField);
        addStudentPanel.add(addButton);

        controlPanel.add(addStudentPanel);

        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        this.getContentPane().add(controlPanel, BorderLayout.SOUTH);
        this.pack();
    }

    private void sortStudentsByRoll(ActionEvent actionEvent) {
        Stack<Student<T>> students = labClass.getList();
        Collections.sort(students, (o1, o2) -> Double.compare(o2.getRoll(), o1.getRoll()));
        refreshTable();
    }

    private void searchStudentByName(ActionEvent actionEvent) {
        try {
            String name = searchTextField.getText();
            boolean founded = false;
            for (Student<T> student : labClass.getList()) {
                if (student.getName().equals(name)) {
                    int index = getStudentIndex(student);
                    if (index != -1) {
                        table.setRowSelectionInterval(index, index);
                        founded = true;
                        break;
                    }
                }
            }
            if (founded == false) {
                throw new StudentNotFoundException("Студент не найден.");
            }
        }
        catch (StudentNotFoundException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
    }

    private int getStudentIndex(Student<T> student) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(student.getName()) &&
                    model.getValueAt(i, 1).equals(student.getId()) &&
                    model.getValueAt(i, 2).equals(student.getRoll())) {
                return i;
            }
        }
        return -1;
    }

    private void refreshTable() {
        model.setRowCount(0);
        for (Student<T> student : labClass.getList()) {
            model.addRow(new Object[]{student.getName(), student.getId(), student.getRoll()});
        }
    }

    private void addStudent(ActionEvent actionEvent) {
        String name = studentNameField.getText().trim();
        String id = studentIdField.getText().trim();
        double roll;
        try {
            if (name.equals("")) {
                throw new EmptyStringException("Пустое поле с именем");
            }
            if (id.equals("")) {
                throw new EmptyStringException("Пустое поле с ID");
            }
            roll = Double.parseDouble(studentRollField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Неправильно введён средний балл",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        catch (EmptyStringException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Student<T> student = new Student<>(name, (T) id, roll);

        labClass.add(student);
        refreshTable();
        studentNameField.setText("");
        studentIdField.setText("");
        studentRollField.setText("");
    }
}
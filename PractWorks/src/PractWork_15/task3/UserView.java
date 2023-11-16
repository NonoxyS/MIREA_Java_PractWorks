package PractWork_15.task3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class UserView {
    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> userList;
    private JTextField userInput;
    private JButton addButton;
    private JMenuItem deleteItem;
    private JMenuItem renameItem;

    public UserView() {
        frame = new JFrame("User List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setResizable(false);

        listModel = new DefaultListModel<>();
        userList = new JList<>(listModel);
        userInput = new JTextField(20);
        addButton = new JButton("Add User");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(new JLabel("User Nickname: "), BorderLayout.LINE_START);
        inputPanel.add(userInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.LINE_END);

        JPanel userListPanel = new JPanel(new BorderLayout());
        userListPanel.add(new JScrollPane(userList), BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.add(inputPanel);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(userListPanel);

        JPopupMenu popupMenu = new JPopupMenu();

        deleteItem = new JMenuItem("Delete");
        renameItem = new JMenuItem("Rename");

        deleteItem.addActionListener(e -> {
            int selected = userList.getSelectedIndex();
            if (selected != -1) {
                listModel.remove(selected);
            }
        });

        renameItem.addActionListener(e -> {
            int selected = userList.getSelectedIndex();
            if (selected != -1) {
                String newName = JOptionPane.showInputDialog(frame, "Enter new name");
                if (newName != null && !newName.trim().isEmpty()) {
                    listModel.set(selected, newName);
                }
            }
        });

        popupMenu.add(deleteItem);
        popupMenu.add(renameItem);
        userList.setComponentPopupMenu(popupMenu);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public String getUserInput() {
        return userInput.getText();
    }

    public void setUserList(List<String> users) {
        listModel.clear();
        for (String user : users) {
            listModel.addElement(user);
        }
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public int getSelectedUserIndex() {
        return userList.getSelectedIndex();
    }

    public void setUserDeleteListener(ActionListener listener) {
        deleteItem.addActionListener(listener);
    }

    public void setUserRenameListener(ActionListener listener) {
        renameItem.addActionListener(listener);
    }

    public JFrame getFrame() {
        return frame;
    }
}
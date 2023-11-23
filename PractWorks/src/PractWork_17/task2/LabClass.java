package PractWork_17.task2;

import java.util.Stack;

public class LabClass<T> {
    private T id_class;
    private Stack <Student<T>> list = new Stack<>();
    public LabClass(T id) {
        setId_class(id);
    }
    public LabClass(Stack<Student<T>> list, T id) {
        this.list = list;
        setId_class(id);
    }
    public T getId_class() {
        return id_class;
    }

    public Stack<Student<T>> getList() {
        return list;
    }

    private void setId_class(T id) {
        this.id_class = id;
    }
    public void add(Student<T> student) {
        list.add(student);
    }
    public void remove(Student<T> student) {
        list.remove(student);
    }
}
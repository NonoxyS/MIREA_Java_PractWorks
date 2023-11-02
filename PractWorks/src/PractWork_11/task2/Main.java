package PractWork_11.task2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alexander", 200);
        students[1] = new Student("Andrey", 325);
        students[2] = new Student("Irina", 150);
        students[3] = new Student("Gerasim", 300);
        students[4] = new Student("Egor", 150);

        SortingStudentsByGPA sortObj = new SortingStudentsByGPA();

        sortObj.printStudents(students);
        sortObj.quickSort(students, 0, students.length - 1);
        sortObj.printStudents(students);
    }
}

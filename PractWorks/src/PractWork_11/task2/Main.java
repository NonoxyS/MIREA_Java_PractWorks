package PractWork_11.task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alexander", 200);
        Student s2 = new Student("Andrey", 325);
        Student s3 = new Student("Irina", 150);
        Student s4 = new Student("Gerasim", 300);
        Student s5 = new Student("Egor", 150);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        SortingStudentsByGPA sortObj = new SortingStudentsByGPA();

        sortObj.printStudents(students);
        sortObj.quickSort(students, 0, students.length - 1);
        sortObj.printStudents(students);
    }
}

package PractWork_11.task1;

public class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Andrey", 123);
        students[1] = new Student("Alexander", 456);
        students[2] = new Student("Dmitriy", 789);
        students[3] = new Student("Arseniy", 234);
        students[4] = new Student("Artem", 567);

        System.out.println("Исходный массив:");
        printStudents(students);
        
        insertionSort(students);
        System.out.println("Отсортированный массив:");
        printStudents(students);
    }

    public static void insertionSort(Student[] students) {

        for (int i = 1; i < students.length; i++)
        {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getiDNumber());
        }
        System.out.println();
    }
}

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }
}
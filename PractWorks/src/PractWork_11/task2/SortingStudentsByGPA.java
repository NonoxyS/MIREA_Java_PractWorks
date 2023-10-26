package PractWork_11.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2)
    {
        return (s1.getGPA() - s2.getGPA());
    }

    public void quickSort(Student[] students, int low, int high)
    {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high)
    {
        Student pivot = students[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) > 0)
            {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);

        return i + 1;
    }

    public void swap(Student[] students, int i, int j)
    {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getGPA());
        }
        System.out.println();
    }
}
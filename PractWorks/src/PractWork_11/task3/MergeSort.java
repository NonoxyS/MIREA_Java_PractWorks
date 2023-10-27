package PractWork_11.task3;

class Student {
    private String name;
    private int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Student[] l1 = new Student[3];
        l1[0] = new Student("Andrey", 300);
        l1[1] = new Student("Alexander", 120);
        l1[2] = new Student("Maria", 345);

        Student[] l2 = new Student[3];
        l2[0] = new Student("Alexey", 225);
        l2[1] = new Student("Artem", 175);
        l2[2] = new Student("Daniil", 100);

        Student[] mergedList = mergeSort(l1, l2);

        for (Student student : mergedList) {
            System.out.println(student.getName() + " " + student.getGpa());
        }
    }

    public static Student[] mergeSort(Student[] list1, Student[] list2) {
        if (list1.length <= 1 && list2.length <= 1) {
            return merge(list1, list2);
        }

        int mid1 = list1.length / 2;
        int mid2 = list2.length / 2;

        Student[] list1Left = subArray(0, mid1, list1);
        Student[] list1Right = subArray(mid1, list1.length, list1);

        Student[] list2Left = subArray(0, mid2, list2);
        Student[] list2Right = subArray(mid2, list2.length, list2);

        Student[] sortedLeft = mergeSort(list1Left, list2Left);
        Student[] sortedRight = mergeSort(list1Right, list2Right);

        return merge(sortedLeft, sortedRight);
    }

    public static Student[] merge(Student[] list1, Student[] list2) {
        int i = 0, j = 0, k = 0;
        Student[] mergedList = new Student[list1.length + list2.length];

        while (i < list1.length && j < list2.length) {
            Student student1 = list1[i];
            Student student2 = list2[j];

            if (student1.getGpa() < student2.getGpa()) {
                mergedList[k] = student1;
                i++;
            }
            else {
                mergedList[k] = student2;
                j++;
            }
            k++;
        }

        while (i < list1.length) {
            mergedList[k] = list1[i];
            i++;
            k++;
        }

        while (j < list2.length) {
            mergedList[k] = list2[j];
            j++;
            k++;
        }

        return mergedList;
    }

    public static Student[] subArray(int start, int end, Student[] array) {
        Student[] newSubArray = new Student[end - start];
        int j = start;
        for (int i = 0; i < (end - start); i++) {
            newSubArray[i] = array[j++];
        }
        return newSubArray;
    }
}
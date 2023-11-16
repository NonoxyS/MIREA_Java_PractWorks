package PractWork_14;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bounded List: ");
        BoundedWaitList<Integer> arr1 = new BoundedWaitList<Integer>(2);
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1);
        arr1.add(3);
        System.out.println(arr1);


        System.out.println("\nWait list: ");
        WaitList<Integer> arr2 = new WaitList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.remove();
        System.out.println(arr2);
        System.out.println(arr2.isEmpty());


        System.out.println("\nUnfairWaitList: ");
        UnfairWaitList<Integer> arr3 = new UnfairWaitList<>();
        arr3.add(2);
        arr3.add(1);
        arr3.add(4);
        arr3.moveToBack();
        arr3.remove(4);
        System.out.println(arr3);
        arr3.add(4);
        System.out.println(arr3);
    }
}
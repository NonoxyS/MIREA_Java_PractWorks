package PractWork_14;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    private ConcurrentLinkedQueue<E> deleted_content = new ConcurrentLinkedQueue<>();
    public void remove(E element) {
        if (element != content.peek()) {
            content.remove(element);
            deleted_content.add(element);
        }
    }
    public void moveToBack() {
        content.add(content.peek());
        content.remove(content.peek());
    }

    public void add(E element) {
        if (!deleted_content.contains(element))
            content.add(element);
    }
}
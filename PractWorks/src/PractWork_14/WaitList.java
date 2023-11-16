package PractWork_14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    ConcurrentLinkedQueue<E> content;
    WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }
    public void add(E element) {content.add(element);}
    public E remove() {return content.remove();}
    public boolean isEmpty() {return content.isEmpty();}
    public boolean contains(E element) {return content.contains(element);}
    public boolean containsAll(Collection<E> c) {return content.containsAll(c);}
    public String toString() {return content.toString();}
}
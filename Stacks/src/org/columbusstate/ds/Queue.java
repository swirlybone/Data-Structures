package org.columbusstate.ds;

public interface Queue<E> {

    // Put element on rear
    public boolean enqueue(E it);

    // Remove and return element from front
    public E dequeue();

    // Return front element
    public E offer();

    // Return queue size
    public int length();

    // Return true if the queue is empty
    public boolean isEmpty();
}

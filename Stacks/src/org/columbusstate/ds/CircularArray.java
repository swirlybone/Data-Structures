package org.columbusstate.ds;

public class CircularArray<T> implements Queue<T> {
    public static final int INITIAL_SIZE = 20;

    T[] elements = (T[])(new Object[INITIAL_SIZE]);
    int head = 0;
    int tail = 0;
    int size = 0;

    @Override
    public boolean enqueue(T it) {

        if(size == elements.length)
        {
            expandArray();
        }

        elements[tail] = it;
        tail = (tail + 1) % elements.length;
        size = size + 1;
        return true;
    }


    private void expandArray(){
        T[] tempElem = (T[])(new Object[elements.length * 2]);

        for(int i = 0; i < this.size; i++)
        {
            tempElem[i] = elements[(head + i) % elements.length];
        }

        head = 0;
        tail = size;
        elements = tempElem;
    }

    @Override
    public T dequeue() {

        if(isEmpty()){
            return null;
        }

        T returnElem = elements[head];
        elements[head] = null;

        head = (head + 1) % elements.length;
        size--;
        return returnElem;
    }

    @Override
    public T offer() {
        if(isEmpty()){
            return null;
        }

        T returnElem = elements[head];
        return returnElem;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

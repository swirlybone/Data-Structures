package org.columbusstate.ds;

public class ArrayList<T> implements List<T> {


    public static int INITIAL_SIZE = 20;
    T[] elements = (T[])(new Object[INITIAL_SIZE]);
    int tail = 0;

    public void expandArray(){
        T[] tempElem = (T[])(new Object[elements.length * 2]);

        for(int i = 0; i < this.tail; i++) {
            tempElem[i] = elements[i];
        }
        elements = tempElem;
    }


    @Override
    public boolean add(T element) {
        if(tail == elements.length)
        {
            expandArray();
        }
        elements[tail] = element;
        tail = tail + 1;
        return true;
    }

    @Override
    public boolean add(int index, T element) {
        if((index >= tail) && (index < 0))
        {
            return false; //usually you throw an exception or return false if the interface for add needs to return one
        }

        if(tail == elements.length) {
            expandArray();
        }

        for(int i = tail; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        tail = tail + 1;
        return true;
        }




    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T object) {
        return null;
    }

    @Override
    public void set(int index, T element) {

    }

    @Override
    public int size() {
        return 0;
    }
}

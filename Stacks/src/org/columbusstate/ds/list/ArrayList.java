package org.columbusstate.ds.list;

public class ArrayList<T> implements List<T> {

    public static final int INITIAL_SIZE = 20;
    T[] elements = (T[])(new Object[INITIAL_SIZE]);
    int tail = 0;


    private void expandArray(){
        T[] tempElem = (T[])(new Object[elements.length * 2]);

        for(int i = 0; i < this.tail; i++)
        {
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
    public boolean add(int index, T element)
    {
        if((index >= tail) && (index < 0))
        {
            return false; //usually you throw an exception or return false if the interface for add needs to return one.
        }

        if(tail == elements.length){
            expandArray();
        }

        for(int i = tail; i > index; i--)
        {
            elements[i] = elements[i -1];
        }

        elements[index] = element;
        tail = tail + 1;

        return true;
    }

    @Override
    public T get(int index) {

        if((index >= tail) && (index < 0))
        {
            return null;
        }

        return elements[index];
    }

    @Override
    public T remove(int index) {

        if((index >= tail) && (index < 0))
        {
            return null; //usually you throw an exception or return false if the interface for add needs to return one.
        }

        T retElement = get(index);//or alternatively T retElement = elements[index];

        for(int i = index; i < tail; i++)
        {
           elements[i] = elements[i + 1];
        }
        tail = tail - 1;

        return retElement;
    }

    @Override
    public T remove(T object) {

        int pos = 0;

        while(!elements[pos].equals(object) && pos < tail)
        {
            pos = pos + 1;
        }

        if(pos < tail){

            return remove(pos);
        }

        return null;
    }

    @Override
    public void set(int index, T element) {
        if((index >= tail) && (index < 0))
        {
            return; //usually you throw an exception or return false if the interface for add needs to return one.
        }

        elements[index] = element;
    }

    @Override
    public int size() {
        return tail;
    }
}

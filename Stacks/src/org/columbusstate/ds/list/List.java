package org.columbusstate.ds.list;

public interface List<T>
{
    public boolean add(T element);
    public boolean add(int index, T element);
    public T get(int index);
    public T remove(int index);
    public T remove(T object);
    public void set(int index, T element);
    public int size();

}

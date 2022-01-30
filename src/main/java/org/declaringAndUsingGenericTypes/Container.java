package org.declaringAndUsingGenericTypes;

/**
 * The Container class declares itself to be a generic type by specifying the <E> formal type parameter list.
 * Type parameter E is used to identify the type of stored elements, the element to be added to the internal array,
 * and the return type when retrieving an element.
 * */
public class Container<E> {
    private E[] elements;
    private int index;

    /**
     * The Container(int size) constructor creates the array via elements = (E[]) new Object[size];.
     * If you’re wondering why I didn’t specify elements = new E[size];, the reason is that it isn’t possible.
     * Doing so could lead to a ClassCastException.
     * */
    public Container(int size) {
        elements = (E[]) new Object[size];
        index = 0;
    }

    void add(E element){
        elements[index++] = element;
    }
    E get(int index){
        return elements[index];
    }
    int size(){
        return index;
    }
}

package org.boundingTypeParametersInJava;

import java.util.Arrays;

/**
 * The SortedEmployees class lets you store Employee subclass instances that implement Comparable in an internal array.
 * This array is sorted (via the java.util.Arrays class’s void sort(Object[] a, int fromIndex, int toIndex)
 * class method) in ascending order of the hourly wage after an Employee subclass instance is added.
 * */
public class SortedEmployees<E extends Employee & Comparable<E>> {

    private E[] employees;
    private int index;
    @SuppressWarnings("unchecked")
    SortedEmployees(int size){
        employees = (E[]) new Employee[size];
        int index = 0;
    }
    void add(E emp){
        employees[index++] = emp;
        Arrays.sort(employees, 0, index);
    }
    E get(int index){
        return employees[index];
    }
    int size(){
        return index;
    }
}

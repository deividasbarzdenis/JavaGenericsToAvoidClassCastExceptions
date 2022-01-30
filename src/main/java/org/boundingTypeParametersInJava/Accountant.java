package org.boundingTypeParametersInJava;

import java.math.BigDecimal;

/**
 * Listing 2’s Employee class abstracts the concept of an employee that receives an hourly wage.
 * This class is subclassed by Accountant, which also implements Comparable<Accountant> to indicate
 * that Accountants can be compared according to their natural order, which happens to be hourly wage in this example.
 * The java.lang.Comparable interface is declared as a generic type with a single type parameter named T.
 * This interface provides an int compareTo(T o) method that compares the current object with the argument (of type T),
 * returning a negative integer, zero, or a positive integer as this object is less than, equal to, or greater
 * than the specified object.
 * */
public class Accountant extends Employee implements Comparable<Accountant>{

    public Accountant(String name, BigDecimal hourlySalary) {
        super(name, hourlySalary);
    }

    @Override
    public int compareTo(Accountant acc) {
        return getHourlySalary().compareTo(acc.getHourlySalary());
    }

}

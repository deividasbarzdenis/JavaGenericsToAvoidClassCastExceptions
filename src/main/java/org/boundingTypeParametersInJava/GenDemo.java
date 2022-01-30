package org.boundingTypeParametersInJava;

import java.math.BigDecimal;

public class GenDemo {
    public static void main(String[] args) {
        SortedEmployees<Accountant> se = new SortedEmployees<Accountant>(10);
        se.add(new Accountant("Joe Doe", new BigDecimal("35.40")));
        se.add(new Accountant("George Smith", new BigDecimal("25.60")));
        se.add(new Accountant("Jane Jones", new BigDecimal("15.20")));
        for(int i = 0; i < se.size(); i++){
            System.out.println(se.get(i));
        }
    }
}

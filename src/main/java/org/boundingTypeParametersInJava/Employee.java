package org.boundingTypeParametersInJava;

import lombok.Getter;

import java.math.BigDecimal;

public abstract class Employee {
    @Getter
    private BigDecimal hourlySalary;
    @Getter
    private String name;

    public Employee(String name, BigDecimal hourlySalary ) {
        this.hourlySalary = hourlySalary;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + hourlySalary.toString();
    }
}

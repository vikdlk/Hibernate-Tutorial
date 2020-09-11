package com.hibernate.inheritance.singletable.Entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
public class Instructor extends User {

    private Double salary;

    public Instructor(String fistName, String lastName, String email, Double salary) {
        super(fistName, lastName, email);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

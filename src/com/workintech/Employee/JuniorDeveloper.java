package com.workintech.Employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("Junior Developer " + getName() + " is coding.");
        setSalary(getSalary() * 1.10);
    }
}
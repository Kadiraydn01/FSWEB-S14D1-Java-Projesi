package com.workintech.Employee;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("Middle Developer " + getName() + " is coding tasks.");
        setSalary(getSalary() * 1.20);
    }
}
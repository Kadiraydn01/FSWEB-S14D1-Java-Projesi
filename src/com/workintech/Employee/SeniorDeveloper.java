package com.workintech.Employee;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id , String name , double salary){
        super(id, name, salary);
    }
    public void work(){
        System.out.println("Senior Developer " + getName() + " is coding tasks.");
        setSalary(getSalary() * 1.30);
    }
}

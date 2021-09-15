package com.company;

public class Staff extends Person{
    protected double salary;

    Staff(){}

    Staff(String name, double salary){
        super(name);
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "Name = "+ this.name +" Salary = " + this.salary;
    }
}

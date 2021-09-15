package com.company;

public class Lecturer extends Staff{
    protected String subject;

    Lecturer(){}

    Lecturer(String name, double salary, String subject){
        super(name, salary);
        this.subject=subject;
    }
    @Override
    public String toString(){
        return "Name = "+ this.name +" Salary = " + this.salary + " Subject = "+this.subject;
    }
}

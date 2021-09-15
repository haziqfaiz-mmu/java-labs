package com.company;

public class Student extends Person {
    protected int ID;

    Student() {
    }

    Student(String name, int ID) {
        super(name);
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Name = " + this.name + " ID = " + this.ID;
    }
}

package com.company.models;

public class Soldier extends Person{
    public Soldier(String name, int age, int seniorityInMonths, String rank) {
        super(name, age);
        this.seniorityInMonths = seniorityInMonths;
        this.rank = rank;
    }

    private int seniorityInMonths;
    private String rank;

}

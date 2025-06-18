package org.example;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
    }

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname) ;
        this.experienceInYears=experienceInYears;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this(name,surname,experienceInYears);
        this.englishLevel=englishLevel;
        this.salary=salary;
    }

    public void work() {
        System.out.println(name + " is testing software.");
    }

    public void work(String project) {
        System.out.println(name + " is testing software on project: " + project);
    }

    public void work(String project, int hours) {
        System.out.println(name + " is testing software on project: " + project + " for " + hours + " hours.");
    }

    public static void printCompany() {
        System.out.println("Testers work at various IT companies worldwide.");
    }
}



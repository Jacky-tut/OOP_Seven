package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private String companyName;
    private double salary;
    private boolean distantWork;


    public Vacancy(String companyName, double salary, boolean distantWork) {
        this.companyName = companyName;
        this.salary = salary;
        this.distantWork = distantWork;
    }

    protected String getCompanyName() {
        return companyName;
    }

    protected double getSalary() {
        return salary;
    }

    protected boolean getDistantWork() {
        return distantWork;
    }
}

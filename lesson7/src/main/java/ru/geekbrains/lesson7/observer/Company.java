package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random;

    private String nameCompany;

    private Publisher jobAgency;

    private double maxSalary;

    public Company(String nameCompany, Publisher jobAgency, double maxSalary) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        random = new Random();
    }

    public void needEmployee(){
        String companyName = nameCompany;
        double salary = random.nextDouble(maxSalary);
        boolean distantWork = random.nextBoolean();
        jobAgency.sendOffer(new Vacancy(companyName, salary, distantWork));
    }

}

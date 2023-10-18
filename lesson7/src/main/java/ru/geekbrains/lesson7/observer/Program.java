package ru.geekbrains.lesson7.observer;

public class Program {

    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 80000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        DistantWorker distantWorker1 = new DistantWorker("Удаленщик #1");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(distantWorker1);

        for (int i = 0; i < 5; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}

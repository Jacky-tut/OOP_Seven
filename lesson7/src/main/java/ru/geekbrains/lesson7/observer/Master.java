package ru.geekbrains.lesson7.observer;

public class Master implements Observer{

    private String name;
    private double salary = 80000;
    private boolean distantWork;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        distantWork = false;
    }
    @Override
    public void receiveOffer(Vacancy vacancy) {
        String distantType;
        if (vacancy.getDistantWork() == true){
            distantType = "Удалённая работа";
        }
        else{
            distantType = "Работа на территории работодателя";
        }
        if ((this.salary < vacancy.getSalary()) && (this.distantWork == vacancy.getDistantWork())){
            System.out.printf("%s Мне нужна эта работа! %s - %s - %f\n", this.name,
                    distantType,
                    vacancy.getCompanyName(),
                    vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("%s Я найду работу получше! %s - %s - %f\n", this.name,
                    distantType,
                    vacancy.getCompanyName(),
                    vacancy.getSalary());
        }
    }
}

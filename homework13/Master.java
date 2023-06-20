package homework13;

import java.util.Random;

import homework13.Vacancy.VacancyType;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private VacancyType vacancyType;
    private double minSalary;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (minSalary <= salary && vacancyType == VacancyType.DEVELOPER){
            System.out.printf("Мастер %s (%f) >>> Мне подходит эта работа! (%s - %f, %s)\n",
                    name, minSalary, nameCompany, salary, vacancyType);
            minSalary = salary;
        }
        else{
            System.out.printf("Мастер %s (%f) >>> Я найду другую работу! (%s - %f, %s)\n",
                    name, minSalary, nameCompany, salary, vacancyType);
        }
    }

}

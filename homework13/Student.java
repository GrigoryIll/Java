package homework13;

import java.util.Random;

import homework13.Vacancy.VacancyType;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;
    private VacancyType vacancyType;
    private double minSalary;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (minSalary <= salary && vacancyType == VacancyType.CLEANER){
            System.out.printf("Студент %s (%f) >>> Мне подходит эта работа! (%s - %f, %s)\n",
                    name, minSalary, nameCompany, salary, vacancyType);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%f) >>> Я найду другую работу! (%s - %f, %s)\n",
                    name, minSalary, nameCompany, salary, vacancyType);
        }
    }
}

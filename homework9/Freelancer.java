package homework9;

import java.util.Random;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public  class Freelancer extends Employee
{

    static Random random = new Random();

    public Freelancer(String name, String surname, int experience, double salary)
    {
        super(name, surname, experience, salary);
    }


    @Override //переопредел метод подсчета зарплаты
    public double calculateSalary() {
        int orders = random.nextInt(1, 10);
        int reward = random.nextInt(500, 5000);
        salary = orders * reward;
    return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Стаж: %d, Среднемесячная заработная плата (плавающая месячная оплата): %.2f (руб.)", surname, name, getExperience(), calculateSalary());   
    }

}

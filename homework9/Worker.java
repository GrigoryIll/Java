package homework9;

public class Worker extends Employee {

    public Worker(String name, String surname, int experience, double salary) {
        super(name, surname, experience, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Стаж: %d, Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", surname, name, getExperience(), calculateSalary());
    }
}

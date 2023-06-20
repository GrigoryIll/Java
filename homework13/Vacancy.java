package homework13;

public class Vacancy 
{

    private String name;
    private double salary;
    public VacancyType vacancyType;


    public Vacancy(String name, double salary, VacancyType vacancyType) 
    {
    this.name = name;
    this.salary = salary;
    this.vacancyType = vacancyType;
    }
    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setVacancyType(VacancyType vacancyType) {
        this.vacancyType = vacancyType;
    }

    public enum VacancyType
    {
        DEVELOPER,
        MANAGER,
        CLEANER;
    }
}

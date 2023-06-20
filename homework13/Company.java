package homework13;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private  double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee()
    {
        double salary = random.nextDouble(2500, 150000);
        Vacancy.VacancyType vacancyType = Vacancy.VacancyType.values()[random.nextInt(Vacancy.VacancyType.values().length)];  
        jobAgency.sendOffer(nameCompany, salary, vacancyType);
    }

}

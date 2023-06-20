package homework13;

import homework13.Vacancy.VacancyType;

public class Program 
{


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */

    public static void main(String[] args) 
    {

        JobAgency jobAgency = new JobAgency();



        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", VacancyType.DEVELOPER);
        Master petrov = new Master("Petrov", VacancyType.DEVELOPER);
        Student sidorov = new Student("Sidorov", VacancyType.CLEANER);
        Manager fomichev = new Manager("Fomichev", VacancyType.MANAGER);    

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(fomichev);

        for (int i = 0; i < 1; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}

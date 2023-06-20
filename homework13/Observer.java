package homework13;

import homework13.Vacancy.VacancyType;

public interface Observer {

    void receiveOffer(String nameCompany, double salary, VacancyType vacancyType);
}

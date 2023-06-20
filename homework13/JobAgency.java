package homework13;

import java.util.ArrayList;
import java.util.List;

import homework13.Vacancy.VacancyType;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany, double salary, VacancyType vacancyType) {
        for (Observer observer: observers) 
        {
            observer.receiveOffer(nameCompany, salary, vacancyType);
        }
    }

}

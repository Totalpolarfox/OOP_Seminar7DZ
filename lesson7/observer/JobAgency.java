package lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>(); // коллекция хранения наблюдателей

    public void sendOffer(String companyName, int salary, String vacancy) {
        Collection<Observer> observersCopy = new ArrayList<>(observers);
        for (Observer observer : observersCopy) { // проходим по каждому наблюдателю
            if (observer.getVacancy() == vacancy || observer.getVacancy() == "any")
                observer.receiveOffer(companyName, salary, vacancy); // и передаем им данные от компании по вакансии
        }      
    }

    @Override
    public void registerObserver(Observer observer) { // добавление нового наблюдателя
        observers.add(observer);
        System.out.printf("Соискатель %s добавлен для наблюдения за вакансиями.\n", observer.getName());
    }

    @Override
    public void removeObserver(Observer observer) { // удаление старого наблюдателя
        observers.remove(observer);        
        System.out.printf("\tСоискатель %s согласился на вакансию. Он удален из дальнейших предложений.\n", observer.getName());
    }

    public void printObserver (){
        observers.forEach(System.out::println);
    }
}

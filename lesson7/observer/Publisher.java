package lesson7.observer;

public interface Publisher {

    void sendOffer(String companyName, int salary, String vacancy);

    void registerObserver(Observer observer);  // регистрация нового наблюдателя

    void removeObserver(Observer observer); // удаление старого наблюдателя

    void printObserver();

}

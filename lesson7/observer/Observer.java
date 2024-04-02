package lesson7.observer;

public interface Observer { 

    String getName();
    
    String getVacancy();

    void receiveOffer(String nameCompany, int salary, String vacancy); // передаем наблюдателям данные от компании по вакансии

}

package lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary; // потолок зарплаты

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){     // запрос кадровому агентству на поиск сотрудника
        String vacancy = VacancySelector.getRandomVacancy();
        int salary = random.nextInt(maxSalary); // генерация зарплаты
        jobAgency.sendOffer(name, salary, vacancy);
    }


}

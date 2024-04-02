package lesson7.observer;


public class BackEndDeveloper implements Observer{

    private String name;
    private int salary;
    private String vacancy;
    private Publisher publisher;
    
    public BackEndDeveloper(String name, Publisher publisher){
        this.name = name;
        salary = 85000;
        this.vacancy = "BackEndDeveloper";
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getVacancy() {
        return vacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String vacancy) { 
        if (this.salary <= salary){
            System.out.printf("Соискатель %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; вакансия: %s)\n",
                    name, nameCompany, salary, vacancy);
            //this.salary = salary;
            publisher.removeObserver(this);
        }
        else {
            System.out.printf("Соискатель %s: Я найду работу получше! (компания: %s; заработная плата: %d; вакансия: %s)\n",
                    name, nameCompany, salary, vacancy);
        }
    }

}

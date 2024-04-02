package lesson7.observer;

public class Program {

    public static void main(String[] args) {
        Publisher publisher = new JobAgency(); // создаем кадровое агентство
        Company google = new Company("Google", publisher, 120000);  // создаем несколько компаний с условиями
        Company yandex = new Company("Yandex", publisher, 112000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1", publisher); // создаем несколько соискателей
        Student student2 = new Student("Student #2", publisher);
        Master master1 = new Master("Master #1", publisher);
        Master master2 = new Master("Master #2", publisher);
        BackEndDeveloper backEndDeveloper1 = new BackEndDeveloper("BackEndDeveloper #1", publisher);        
        FrontEndDeveloper frontEndDeveloper1 = new FrontEndDeveloper("FrontEndDeveloper #1", publisher);
        DatabaseDeveloper databaseDeveloper1 = new DatabaseDeveloper("DatabaseDeveloper #1", publisher);
        SeoSpecialist seoSpecialist1 = new SeoSpecialist("SeoSpecialist #1", publisher);
        Tester tester1 = new Tester("Tester #1", publisher);
        WebProgrammer webProgrammer1 = new WebProgrammer("WebProgrammer #1", publisher);

        publisher.registerObserver(student); // регистрируем наблюдателей
        publisher.registerObserver(student2);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(frontEndDeveloper1);
        publisher.registerObserver(backEndDeveloper1);
        publisher.registerObserver(databaseDeveloper1);
        publisher.registerObserver(seoSpecialist1);
        publisher.registerObserver(tester1);
        publisher.registerObserver(webProgrammer1);

        System.out.println("=====");
        
        for (int i = 0; i < 3; i++){ // каждая компания делает 3 запроса на поиск сотрудника
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}

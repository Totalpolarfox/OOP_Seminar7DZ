package lesson7.observer;

import java.util.Random;

public class VacancySelector {

    private static final String[] availableVacancies = {
            "BackEndDeveloper",
            "DatabaseDeveloper",
            "FrontEndDeveloper",
            "SeoSpecialist",
            "Tester",
            "WebProgrammer"
    };

    // Метод для получения случайной вакансии
    public static String getRandomVacancy() {
        Random random = new Random();
        int index = random.nextInt(availableVacancies.length);
        return availableVacancies[index];
    }
}
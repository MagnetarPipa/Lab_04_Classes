package com.company;

public class StringDataBase {

    private static String[] company_names = {"Morgan industries", "Morgan industries", "Centauri monopoly", "Sunlight inc.", "TerraMars inc.", "Liandri Corporations"};
    private static String[] names = {"Лавренцов", "Прокопенко", "Шовковский", "Руденко", "Кернозенко"};
    private static String[] birth_places = {"Прага", "Киев", "Одесса"};
    private static String[] roles = {"Нападающие", "Полузащитники", "Защитники", "Вратарь"};

    public static String getRandomCompany() {

        return company_names[(int) (Math.random() * company_names.length)];
    }

    public static String getRandomName() {

        return names[(int) (Math.random() * names.length)];
    }

    public static String getRandomPlace() {

        return birth_places[(int) (Math.random() * birth_places.length)];
    }

    public static String getRandomRole() {

        return roles[(int) (Math.random() * roles.length)];
    }


}

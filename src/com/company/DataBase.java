package com.company;

public class DataBase {

    private static String[] company_names = {"Morgan industries", "Morgan industries", "Centauri monopoly", "Sunlight inc.", "TerraMars inc.", "Liandri Corporations"};

    public static String getRandomCompany() {

        return company_names[(int) Math.random() * company_names.length];
    }


}

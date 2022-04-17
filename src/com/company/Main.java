package com.company;

import java.util.Scanner;

/**
 * Количеств
 * Цена
 * Год изготовления
 * Производитель
 */
class Product {


    private String company_name = "";

    public void setCompanyName(String str) {
        this.company_name = str;
    }

    public String getCompanyName() {
        return company_name;
    }


    private int year_of_production = 0;

    public void setYear0fProduction(int year) {
        this.year_of_production = year;
    }

    public int getYearOfProduction() {
        return year_of_production;
    }

    private int price = 0;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    private int amount;

    public void setAmount(int count) {
        this.amount = count;
    }

    public int getAmount() {
        return amount;
    }

    /**
     * Количеств
     * Цена
     * Год изготовления
     * Производитель
     */
    public void PrintInformation() {

        System.out.println("Количество:" + getAmount() + " Цена:" + getPrice() + " Год изготовления:" + getYearOfProduction() + " Производитель:" + getCompanyName());
    }

}

/**
 * Фамилия
 * Дата рождения
 * Амплуа
 * Количество игр
 * Количество забитых мячей
 * Место рождения
 */
class Footballer {

    private String surname = "";

    public void setSurname(String str) {
        this.surname = str;
    }

    public String getSurname() {
        return surname;
    }

    private int birthdate = 0;

    public void setBirthDate(int b_date) {
        this.birthdate = b_date;
    }

    public int getBirthDate() {
        return birthdate;
    }

    private String role = "";

    public void setRole(String str) {
        this.role = str;
    }

    public String getRole() {
        return role;
    }

    private int amount_of_games = 0;

    public void setAmount_of_games(int amount) {
        this.amount_of_games = amount;
    }

    public int getAmount_of_games() {
        return amount_of_games;
    }

    private float amount_of_goals = 0;

    public void setAmount_of_goals(float goals) {
        this.amount_of_goals = goals;
    }

    public float getAmount_of_goals() {
        return amount_of_goals;
    }

    private String birth_place = "";

    public void setBirth_place(String place) {
        this.birth_place = place;
    }

    public int getBirthdate() {
        return birthdate;
    }
}


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        task01();
        task02();
    }

    /**
     * Определить самый дорогой товар на складе и
     * напечатать все сведения о нем.
     */
    private static void task01() {

        System.out.println("----Первое задание----");

        Product[] products = new Product[5];
        String[] company_names = new String[5];
        company_names[0] = "Muttela";
        company_names[1] = "Koka Cola";
        company_names[2] = "Odidas";
        company_names[3] = "TerraMars inc.";
        company_names[4] = "Liandri Corporations";

        int count = 0;
        for (int i = 0; i < products.length; i++) {

            products[i] = new Product();
            products[i].setCompanyName(company_names[(int) (Math.random() * 5)]);
            products[i].setPrice(1 + (int) (Math.random() * 3000));
            products[i].setYear0fProduction(1999 + (int) (Math.random() * 2026));

            count++;


        }
        for (int i = 0; i < products.length; i++) {
            products[i].setAmount(count);
            products[i].PrintInformation();
        }
        System.out.println(" ");
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < products.length; i++) {

            if (products[i].getPrice() > max) {
                max = products[i].getPrice();
                maxIndex = i;
            }
        }
        System.out.print("Самый дорогой товар на складе и информация о нем: ");
        products[maxIndex].PrintInformation();

    }

    /**
     * Вывести сведения о футболистах, старших 20-ти лет и
     * забивающих за игру не менее 0,4 мяча.
     */
    private static void task02() {

        Footballer[] footballers = new Footballer[5];
        String[] names = new String[5];//Взял наиболее часто встречающиеся
        names[0]="Liam";
        names[1]="Noah";
        names[2]="Oliver";
        names[3]="Elijah";
        names[4]="William";





    }


}

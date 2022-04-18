package com.company;

import java.util.Scanner;

import java.time.LocalDate;

/**
 * Количеств
 * Цена
 * Год изготовления
 * Производитель
 */

class Product {

    private String company_name = "";
    private int year_of_production = 0;
    private int price = 0;
    private int amount;

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String str) {
        this.company_name = str;
    }

    public void setYear0fProduction(int year) {
        this.year_of_production = year;
    }

    public int getYearOfProduction() {
        return year_of_production;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int count) {
        this.amount = count;
    }

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
    private LocalDate birthdate;
    private String role = "";
    private int amount_of_games = 0;
    private double amount_of_goals = 0;
    private String birth_place = "";

    public String getSurname() {
        return surname;
    }

    public void setSurname(String str) {
        this.surname = str;
    }

    public LocalDate getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(LocalDate date) {
        this.birthdate = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String str) {
        this.role = str;
    }

    public int getAmount_of_games() {
        return amount_of_games;
    }

    public void setAmount_of_games(int amount) {
        this.amount_of_games = amount;
    }

    public double getAmount_of_goals() {
        return amount_of_goals;
    }

    public void setAmount_of_goals(double goals) {
        this.amount_of_goals = goals;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String place) {
        this.birth_place = place;
    }

    public void PrintInformation() {

        System.out.println("Фамилия:" + getSurname() + " Дата рождения:" + getBirthDate() + " Амплуа:" + getRole() + " Количество игр:" + getAmount_of_games() + " Количество забитых мячей:" + getAmount_of_goals() + " Место рождения:" + getBirth_place());
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
       // String[] company_names = { "Morgan industries","Morgan industries","Centauri monopoly","Sunlight inc.","TerraMars inc.", "Liandri Corporations"};

        int count = 0;
        for (int i = 0; i < products.length; i++) {

            products[i] = new Product();
          //  products[i].setCompanyName(company_names[(int) (Math.random() * company_names.length)]);
            products[i].setCompanyName(DataBase.getRandomCompany());
            products[i].setPrice(1 + (int) (Math.random() * 3000));
            products[i].setYear0fProduction(1999 + (int) (Math.random() * 100));
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

        System.out.println("----Второе Задание----");

        Footballer[] footballers = new Footballer[5];
        String[] names = {"Лавренцов","Прокопенко","Шовковский","Руденко","Кернозенко"};

        String[] birth_places = { "Прага","Киев","Одесса"};

        String[] roles = {"Нападающие","Полузащитники","Защитники","Вратарь"};

        for (int i = 0; i < footballers.length; i++) {

            long rand_year = (long) (Math.random() * 30);

            footballers[i] = new Footballer();
            footballers[i].setSurname(names[(int) (Math.random() * names.length)]);
            footballers[i].setBirthDate(LocalDate.now().minusYears(rand_year));
            footballers[i].setRole(roles[(int) (Math.random() * roles.length)]);
            footballers[i].setAmount_of_games(1 + (int) (Math.random() * 20));
            footballers[i].setAmount_of_goals(1 + (int) (Math.random() * 6));
            footballers[i].setBirth_place(birth_places[(int) (Math.random() * birth_places.length)]);


            double sum = (double) footballers[i].getAmount_of_goals() / footballers[i].getAmount_of_games();

            if (LocalDate.now().getYear() - footballers[i].getBirthDate().getYear() > 20 && sum > 0.4) {


                System.out.print("Информация о футболисте страше 20 и у которого среднее значение голов больше чем 0.4--");
                footballers[i].PrintInformation();

            } else {

                System.out.println("Этот футболист моложе 20 или среднее значение голов меньше 0.4");
            }//выпадение с нужными параметрами не частое

        }

    }


}

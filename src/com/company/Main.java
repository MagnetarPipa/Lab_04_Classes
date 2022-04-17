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

        System.out.println("Количество:" + getAmount() + " Цена" + getPrice() + " Год изготовления:" + getYearOfProduction() + " Производитель:" + getCompanyName());
    }

}


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        task01();

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
        company_names[3] = "Cow King";
        company_names[4] = "Windows Donald's";

        int count = 0;
        for (int i = 0; i < products.length; i++) {

            products[i] = new Product();
            products[i].setCompanyName(company_names[(int) (Math.random() * 5)]);
            products[i].setPrice(1 + (int) (Math.random() * 3000));
            products[i].setYear0fProduction(1999 + (int) (Math.random() * 2022));

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


}

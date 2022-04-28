package com.company.Classes;


/**
 * Количеств
 * Цена
 * Год изготовления
 * Производитель
 */
public class Product {


    // private int amount;
    private int price;
    private int year_of_production;
    private String manufacturer;

    public Product(int price, int year_of_production, String manufacturer) {
        // this.amount = amount; System.out.println(users);
        this.price = price;
        this.year_of_production = year_of_production;
        this.setManufacturer(manufacturer);
    }

    // public int getAmount() {
    //     return amount;
    // }

    // public void setAmount(int amount) {
    //       this.amount = amount;
    // }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer.strip();
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", year_of_production=" + year_of_production +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }


}

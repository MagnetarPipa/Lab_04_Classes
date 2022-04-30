package com.company;

import com.company.Classes.*;

import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //task01();
        task02();
    }


    /**
     * Определить самый дорогой товар на складе и
     * напечатать все сведения о нем.
     */
    private static void task01() {

        System.out.println("\n----Первое задание----\n");

        Product product1 = new Product(30000, 2035, "Morgan ind.");
        Product product2 = new Product(15000, 2082, "Liandri corp.");
        Product product3 = new Product(1700000, 2038, "Centauri monopoly");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println();

        final Products products = new Products(3);

        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);


        System.out.println(products);

        System.out.println("The most expensive product is: " + products.findMostExpensiveProduct());

    }

    /**
     * Вывести сведения о футболистах, старших 20-ти лет и
     * забивающих за игру не менее 0,4 мяча.
     */
    private static void task02() {

        System.out.println("\n----Второе Задание----\n");

        Footballer footballer1 = new Footballer("Лавренцов", SystemRole.Attacker, 10, 4, "Одесса");
        Footballer footballer2 = new Footballer("Прокопенко", SystemRole.Defender, 5, 3, "Прага");
        Footballer footballer3 = new Footballer("Руденко", SystemRole.Midfielder, 7, 1, "Киев");
        Footballer footballer4 = new Footballer("Кернозенко", SystemRole.Goalkeeper, 7, 0, "Киев");

//        System.out.println(footballer1);
//        System.out.println(footballer2);
//        System.out.println(footballer3);
//        System.out.println(footballer4);

        System.out.println();

        final Footballers footballers = new Footballers(4);

        footballers.addFootballer(footballer1);
        footballers.addFootballer(footballer2);
        footballers.addFootballer(footballer3);
        footballers.addFootballer(footballer4);

        System.out.println(footballers);

        System.out.println();

        System.out.println("Информация о футболисте страше 20 и у которого среднее значение голов больше чем 0.4: " + footballers.findAgeAbove20());



    }


}


package com.company.Classes;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Вывести сведения о футболистах, старших 20-ти лет и
 * забивающих за игру не менее 0,4 мяча.
 */

public class Footballers {

    private Footballer[] footballers;
    private int currentFootballerNumber;

//
//    public Footballer findAgeAbove20() {
//        Footballer footballer1 = footballers[0];
//
//
//
//        return footballer1;
//    }

    public Footballers(final int footballersNumber) {
        this.footballers = new Footballer[footballersNumber];
        currentFootballerNumber = -1;
    }

    public void addFootballer(final Footballer footballer) {
        if (++currentFootballerNumber < footballers.length) {
            footballers[currentFootballerNumber] = footballer;
        }
    }

    @Override
    public String toString() {

        // Footballer footballer = footballers[0];
        String result = "Footballers: " + System.lineSeparator();

        for (final Footballer footballer : footballers) {
            //if (footballer.getBirthdate().isBefore(footballer1.getBirthdate())) footballer1 = footballer;
            if ((LocalDate.now().getYear() - footballer.getBirthdate().getYear()) > 20) {

                result += footballer + System.lineSeparator();
            }

        }

        return result;
    }
/*
    public String toString() {
        int count = 0;

        String result = "Products: " + System.lineSeparator();

        for (final Product product : products) {
            result += product + System.lineSeparator();
            count++;
        }


        return result + "Amount of products=" + count;
    }


 */
}

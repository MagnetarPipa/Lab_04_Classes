package com.company.Classes;

import java.time.LocalDate;

/**
 * Вывести сведения о футболистах, старших 20-ти лет и
 * забивающих за игру не менее 0,4 мяча.
 */

public class Footballers {

    private Footballer[] footballers;
    private int currentFootballerNumber;


   public String findAgeAbove20() {

        String result=""+System.lineSeparator();

        for (final Footballer footballer:footballers){

            double sum = (double) footballer.getAmountOfGoals() / footballer.getAmountOfGames();
            if (LocalDate.now().getYear() - footballer.getBirthDate().getYear() > 20 && sum > 0.4) {

                if(footballer.getBirthDate().getMonthValue()*100+footballer.getBirthDate().getDayOfMonth()+1<=LocalDate.now().getMonthValue()*100+LocalDate.now().getDayOfMonth()+1)
                {

                    result+=footballer+System.lineSeparator();
                }

            } else {

            }
        }



       return result;
   }

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

        String result = "Footballers: " + System.lineSeparator();

        for (final Footballer footballer : footballers) {

                result += footballer + System.lineSeparator();

        }

        return result;
    }

}

package com.company.Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Фамилия
 * Дата рождения
 * Амплуа
 * Количество игр
 * Количество забитых мячей
 * Место рождения
 */

public class Footballer {
    private String surname;
    private LocalDate birthdate;
    private SystemRole role;
    private int amountOfGames;
    private int amountOfGoals;
    private String birthplace;

    public Footballer(String surname, final SystemRole role, int amountOfGames, int amountOfGoals, String birthplace) {
        this.setSurname(surname);
        this.role=role;
        this.birthdate = LocalDate.now().minusYears((long) (Math.random() * 30));
        this.amountOfGames = amountOfGames;
        this.amountOfGoals = amountOfGoals;
        this.setBirthplace(birthplace);
    }

    public SystemRole getRole() {
        return role;
    }

    public void setRole(SystemRole role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.strip();
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

//    public void setBirthdate(LocalDate birthdate) {
//        this.birthdate = birthdate;
//    }

    public int getAmountOfGames() {
        return amountOfGames;
    }

    public void setAmountOfGames(int amountOfGames) {
        this.amountOfGames = amountOfGames;
    }

    public int getAmountOfGoals() {
        return amountOfGoals;
    }

    public void setAmountOfGoals(int amountOfGoals) {
        this.amountOfGoals = amountOfGoals;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace.strip();
    }


    @Override
    public String toString() {
        return "Footballer{" +
                "surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", role=" + role +
                ", amountOfGames=" + amountOfGames +
                ", amountOfGoals=" + amountOfGoals +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }
}

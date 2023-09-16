package ru.netology.javaqa.javaqamvn.service;

public class RestService {

    public int culcRest(int income, int expenses, int threshold) {

        int restMonths = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                restMonths++;
            }
        }
        return restMonths;
    }
}

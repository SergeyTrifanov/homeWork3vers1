package ru.skypro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // задача 1
        int clientIos = 0;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientAnd = 1;
        if (clientAnd == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задание 2
        int clientDeviceYear = 2014;
        if (clientAnd == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        int clientDevice = 2015;
        if (clientAnd == 1 && clientDevice >= 2015) {
            System.out.println("установите приложение для Android по ссылке");
        }
        if (clientIos == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientIos == 0 && clientDevice >= 2015) {
            System.out.println("установите приложение для iOS по ссылке");
        }

        // задание 5
        int monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("месяцев в году только 12");
        }

        // задача 3
        int year = 1600;
        if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)) {
            System.out.println("год " + year + " високосный");
        }
        else {
            System.out.println("год " + year + " не високосный");
        }

        // задача 4 попытка 2
        int deliveryDistances = 101;
        int deliveryDays = 1;
        if (deliveryDistances <=20) {
            System.out.println("доставка займет " + deliveryDays);
        } else if (deliveryDistances >20 && deliveryDistances <60) {
            System.out.println("доставка займет " + (deliveryDays + 1));
        } else if (deliveryDistances >=60 && deliveryDistances <=100) {
            System.out.println("доставка займет " + (deliveryDays +2));
        } else {
            System.out.println("на такое расстояние не ездят");
        }

    }
}

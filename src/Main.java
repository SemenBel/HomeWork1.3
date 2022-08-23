public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // Задание 3
        int year = 2022;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 61;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }
        // Задание 5
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        // Задание 6
        int age = 19;
        int salary = 58_000;

        if (age >= 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
        }
        if (salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.2) + " рублей");
        } else if (salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.5) + " рублей");
        }
        }
    }
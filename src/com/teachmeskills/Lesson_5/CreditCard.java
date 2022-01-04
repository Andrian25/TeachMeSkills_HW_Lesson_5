package com.teachmeskills.Lesson_5;

/**
 * 1.Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданны номер счета и начальная сумма
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCard {

    int accountNumb;
    int currentSum;

    public CreditCard(int accountNumb, int currentSum) {
        this.accountNumb = accountNumb;
        this.currentSum = currentSum;
    }

    public void addSum(int currentSum) {
        System.out.println(currentSum);
        System.out.println(this.currentSum);
        System.out.println(this.currentSum = this.currentSum + currentSum);
        System.out.println("Accrual of the amount to the card: " + this.currentSum);
        System.out.println("Card amount: " + this.currentSum);
    }

    public void withdrawMoney(int Sum) {
        System.out.println(currentSum = currentSum - Sum);
    }
}
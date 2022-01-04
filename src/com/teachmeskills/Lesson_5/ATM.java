package com.teachmeskills.Lesson_5;

/**
 * 2. Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class ATM {

    int[] banknote20;
    int[] banknote50;
    int[] banknote100;

    public ATM(int banknote20Count, int banknote50Count, int banknote100Count) {
        this.banknote20 = new int[banknote20Count];
        this.banknote50 = new int[banknote50Count];
        this.banknote100 = new int[banknote100Count];
    }

    public void withdrawCash(int amountToWithdraw) {
        int totalAmount = 20 * banknote20.length + 50 * banknote50.length + 100 * banknote100.length;

        if (amountToWithdraw > totalAmount) {
            System.out.println("Not enough money in the ATM");
        } else {
            getCash(amountToWithdraw);
        }
    }

    public void getCash(int amountToWithdraw) {
        // расчитываем остаток после выдачи по 20
        int balanceAfter20 = amountToWithdraw % 20;
        // расчитываем сколько 100 выдавать
        int count20ToWithdraw = amountToWithdraw / 20;

        // выдаем 20
        if (count20ToWithdraw > 0) {
            banknote20 = new int[banknote20.length + count20ToWithdraw];
        }
        // расчитываем остаток после выдачи по 50
        int balanceAfter50 = amountToWithdraw % 50;
        // расчитываем сколько 50 выдавать
        int count50ToWithdraw = amountToWithdraw / 50;

        // выдаем 50
        if (count50ToWithdraw > 0) {
            banknote50 = new int[banknote50.length + count50ToWithdraw];
        }
        // расчитываем остаток после выдачи по 100
        int balanceAfter100 = amountToWithdraw % 100;
        // расчитываем сколько 100 выдавать
        int count100ToWithdraw = amountToWithdraw / 100;

        // выдаем 100
        if (count100ToWithdraw > 0) {
            banknote100 = new int[banknote100.length + count100ToWithdraw];
        }

        System.out.println("Amount requested =" + amountToWithdraw);
        System.out.println("Banknotes issued by 20 =" + count20ToWithdraw + "banknotes by 50 =" + count50ToWithdraw + "banknotes by 100 =" + count100ToWithdraw);
        System.out.println("Remainder =" + balanceAfter50);
    }

    public void getATMInfo() {
        int currentBalance = 20 * banknote20.length + 50 * banknote50.length + banknote100.length * 100;
        System.out.println("Current ATM balance = " + currentBalance);
        System.out.println("Bills 20 = " + banknote20.length);
        System.out.println("Bills 50 = " + banknote50.length);
        System.out.println("Bills 100 = " + banknote100.length);
    }
}

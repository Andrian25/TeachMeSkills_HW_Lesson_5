package com.teachmeskills.Lesson_5;

public class CreditCardDemo {
    public static void main(String[] args) {

        System.out.println("Start");

        CreditCard myCreditCart = new CreditCard(750, 155);
        CreditCard myCreditCart2 = new CreditCard(900, 255);
        CreditCard myCreditCart3 = new CreditCard(100, 150);

        myCreditCart.addSum(5);
        myCreditCart2.addSum(15);
        myCreditCart3.withdrawMoney(50);

        System.out.println("End");
    }
}
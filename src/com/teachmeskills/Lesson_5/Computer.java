package com.teachmeskills.Lesson_5;

/**
 * 1. Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD.
 * Для полей RAM и HDD следует создать свои собственные классы.
 * Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
 * Класс RAM имеет поля "название" и "объем"
 * Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний)
 * Класс Computer должен иметь два констурктора:
 * - первый - с параметрами стоимость и модель,
 * - второй - со всеми полями
 * При создании объекта "компьютер" с помощью первого констуктора должны создаватьс поля RAM и HDD с помощью конструкторов по умолчанию.
 * В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран
 * создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран
 */

public class Computer {

    int price;
    String model;
    HDD hDD;
    RAM rAM;
    TypeEnum type;

    public Computer(int price, String model, TypeEnum type) {
        this.hDD = new HDD();
        this.rAM = new RAM();
        this.price = price;
        this.model = model;
        this.type = type;
    }

    public Computer(int price, String model, HDD hDD, RAM rAM, TypeEnum type) {
        this.price = price;
        this.model = model;
        this.hDD = hDD;
        this.rAM = rAM;
        this.type = type;
    }

    public Computer() {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", HDD=" + hDD +
                ", RAM=" + rAM +
                ", Type=" + type + '\'' +
                '}';
    }
}
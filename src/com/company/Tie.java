package com.company;

public class Tie extends Clothing implements MClothing{

    Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    void getInfo() {
        System.out.println("Параметры галстука:\n" +
                "размер - " + size.getEuroSize() + "\n"
                + "цена - " + price + "\n"
                + "цвет - " + color);
    }

    @Override
    public void DressAMan() {
        System.out.println("Мужчина одет");
    }
}

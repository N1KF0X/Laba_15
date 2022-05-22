package com.company;

public class TShirt extends Clothing implements MClothing, WClothing{

    TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    void getInfo() {
        System.out.println("Параметры футболки:\n" +
                "размер - " + size.getEuroSize() + "\n"
                + "цена - " + price + "\n"
                + "цвет - " + color);
    }

    @Override
    public void DressAMan() {
        System.out.println("Мужчина одет");
    }

    @Override
    public void DressAWoman() {
        System.out.println("Женщина одета");
    }
}

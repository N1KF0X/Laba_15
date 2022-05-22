package com.company;

public class Skirt extends Clothing implements WClothing{

    Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    void getInfo() {
        System.out.println("Параметры юбки:\n" +
                "размер - " + size.getEuroSize() + "\n"
                + "цена - " + price + "\n"
                + "цвет - " + color);
    }

    @Override
    public void DressAWoman() {
        System.out.println("Женщина одета");
    }
}

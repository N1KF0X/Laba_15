package com.company;

abstract class Clothing {
    Size size;
    int price;
    String color;

    Clothing(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    abstract void getInfo();
}

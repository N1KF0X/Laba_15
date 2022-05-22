package com.company;

public class Main {

    public static void main(String[] args) {
        TShirt tShirt = new TShirt(Size.S, 449, "Чёрный");
        Tie tie = new Tie(Size.S, 129, "Красный");
        Pants pants = new Pants(Size.XS, 1149, "Серый");
        Skirt skirt = new Skirt(Size.XS, 999, "Белый");

        Clothing[] clothing = new Clothing[] {tShirt, tie, pants, skirt};

        Atelier atelier = new Atelier();
        atelier.dressAMan(clothing);
        atelier.dressAWoman(clothing);
    }
}

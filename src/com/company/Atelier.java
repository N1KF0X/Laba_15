package com.company;

public class Atelier{

    public void dressAMan(Clothing[] clothing) {
        for(Clothing cloth: clothing){
            if (cloth instanceof MClothing){
                cloth.getInfo();
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    public void dressAWoman(Clothing[] clothing) {
        for(Clothing cloth: clothing) {
            if (cloth instanceof MClothing) {
                cloth.getInfo();
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}

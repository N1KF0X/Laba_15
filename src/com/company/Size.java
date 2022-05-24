package com.company;

public enum Size {
    XXS(38){
        @Override
        public String GetDescription(){
            return "Детский размер";
        }
    },
    XS(40),
    S(42),
    M(44),
    L(48);

    int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String GetDescription(){
        return "Взрослый размер";
    }
}


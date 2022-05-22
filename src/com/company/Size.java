package com.company;

public enum Size {
    XXS(46){
        @Override
        public String GetDescription(){
            return "Детский размер";
        }
    },
    XS(32),
    S(34),
    M(36),
    L(40);

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


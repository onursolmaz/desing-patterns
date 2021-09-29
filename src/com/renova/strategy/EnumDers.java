package com.renova.strategy;

public enum EnumDers {

    TURKCE("Türkçe"),
    MATEMATİK("Matematik"),
    FEN("Fen"),
    SOSYAL("Sosyal");

    private String ders;

    EnumDers(String ders) {
        this.ders=ders;
    }


    @Override
    public String toString() {
        return this.ders;
    }
}

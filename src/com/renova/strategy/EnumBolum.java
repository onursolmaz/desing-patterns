package com.renova.strategy;

public enum EnumBolum {

    SAYILSAL("Sayısal"),
    SOZEL("Sözel"),
    ESIT_AGIRLIK("Eşit Ağırlık");

    private String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return this.bolum;
    }
}

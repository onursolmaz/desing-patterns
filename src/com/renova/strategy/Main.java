package com.renova.strategy;


// Bu tasarım kalıbı yardımıyla classı if else blokları ile sürekli refactor etmek yerine
// öğrencinin sadece bölümünü belirliyoruz ve bölümüne göre yapması gereken işi yapıyor.

public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci(EnumBolum.SAYILSAL);
        ogrenci1.getStarateji();

        Ogrenci ogrenci2=new Ogrenci(EnumBolum.ESIT_AGIRLIK);
        ogrenci2.getStarateji();

        Ogrenci ogrenci3=new Ogrenci(EnumBolum.SOZEL);
        ogrenci3.getStarateji();

    }


}

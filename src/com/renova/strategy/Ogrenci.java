package com.renova.strategy;

public class Ogrenci {

    private EnumBolum bolum;
    private SinavStatejisi sinavStatejisi;


    public Ogrenci(EnumBolum bolum){

        if(bolum==null){
            throw new NullPointerException("Bölüm boş olamaz");
        }
        this.bolum=bolum;
        switch (bolum){
            case SAYILSAL:
                sinavStatejisi=new SayılsalStrateji();
                break;
            case SOZEL:
                sinavStatejisi=new SozelStrateji();
                break;
            case ESIT_AGIRLIK:
                sinavStatejisi=new EsitAgirlikStrateji();
                break;
        }

    }

    public void getStarateji(){
        System.out.println(bolum);
        System.out.println("1 => "+this.sinavStatejisi.getFirst()+" çöz");
        System.out.println("2 =>  "+this.sinavStatejisi.getSecond()+" çöz\n");
    }
}

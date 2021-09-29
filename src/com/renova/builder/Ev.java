package com.renova.builder;

public class Ev {

    private String il;
    private String ilce;
    private String mahalle;
    private int odaSayisi;
    private int balkonSayisi;
    private int banyoSayisi;
    private int aidat;
    private int binaYılı;
    private boolean isDublex;
    private boolean hasOtopark;
    private boolean isEsyali;
    private boolean hasKlima;
    private boolean hasAsansör;
    private boolean hasHavuz;


    public Ev() {

    }

    public Ev(String il, String ilce, String mahalle, int odaSayisi, int balkonSayisi, int banyoSayisi, int aidat, int binaYılı, boolean isDublex, boolean hasOtopark, boolean isEsyali, boolean hasKlima, boolean hasAsansör) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.balkonSayisi = balkonSayisi;
        this.banyoSayisi = banyoSayisi;
        this.aidat = aidat;
        this.binaYılı = binaYılı;
        this.isDublex = isDublex;
        this.hasOtopark = hasOtopark;
        this.isEsyali = isEsyali;
        this.hasKlima = hasKlima;
        this.hasAsansör = hasAsansör;
    }


    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }


    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getAidat() {
        return aidat;
    }

    public void setAidat(int aidat) {
        this.aidat = aidat;
    }

    public int getBinaYılı() {
        return binaYılı;
    }

    public void setBinaYılı(int binaYılı) {
        this.binaYılı = binaYılı;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public boolean isHasAsansör() {
        return hasAsansör;
    }

    public void setHasAsansör(boolean hasAsansör) {
        this.hasAsansör = hasAsansör;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", aidat=" + aidat +
                ", binaYılı=" + binaYılı +
                ", isDublex=" + isDublex +
                ", hasOtopark=" + hasOtopark +
                ", isEsyali=" + isEsyali +
                ", hasKlima=" + hasKlima +
                ", hasAsansör=" + hasAsansör +
                '}';
    }
}

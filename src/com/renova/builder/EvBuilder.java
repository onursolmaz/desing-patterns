package com.renova.builder;

public class EvBuilder {

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


    public static EvBuilder startBuild(String il, String ilce, String mahalle,int odaSayisi) {
        EvBuilder evBuilder=new EvBuilder();
        evBuilder.il=il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.odaSayisi=odaSayisi;
        return evBuilder;
    }

    public static EvBuilder startDublexEv(String il, String ilce, String mahalle,int odaSayisi) {
        EvBuilder evBuilder=new EvBuilder();
        evBuilder.il=il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.odaSayisi=odaSayisi;
        evBuilder.isDublex=true;
        return evBuilder;
    }

    public static EvBuilder startHavuzluEv(String il, String ilce, String mahalle,int odaSayisi) {
        EvBuilder evBuilder=new EvBuilder();
        evBuilder.il=il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.odaSayisi=odaSayisi;
        evBuilder.hasHavuz=true;
        return evBuilder;
    }

    public Ev build() {
        Ev ev = new Ev();
        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);
        ev.setOdaSayisi(odaSayisi);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setAidat(aidat);
        ev.setBinaYılı(binaYılı);
        ev.setEsyali(isEsyali);
        ev.setAidat(aidat);
        ev.setDublex(isDublex);
        ev.setHasAsansör(hasAsansör);
        ev.setHasKlima(hasKlima);
        ev.setHasOtopark(hasOtopark);
        return ev;
    }


    public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setAidat(int aidat) {
        this.aidat = aidat;
        return this;
    }

    public EvBuilder setBinaYılı(int binaYılı) {
        this.binaYılı = binaYılı;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasAsansör(boolean hasAsansör) {
        this.hasAsansör = hasAsansör;
        return this;
    }
}

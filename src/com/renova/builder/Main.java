package com.renova.builder;

//Buradaki problem çok karışık bir constructor yapısı, okunabilirliği düşük.
// Bazı değerleri gerekli, bazılarını opsiyonal yapmak istediğimizde sıkıntı oluyor.
// farklı çeşitlerde constructor oluşturamıyoruz(Aynı tip parametrelerin çakışması durumu)
// Nesnenin değişmezliğini(immutable) bazı durumlarda koruyamıyoruz.

public class Main {

    public static void main(String[] args) {
        Ev ev1= new Ev();
        ev1.setIl("Ankara");
        ev1.setIlce("Çankaya");
        ev1.setMahalle("Sögütözü");
        ev1.setOdaSayisi(4);
        ev1.setBalkonSayisi(2);
        ev1.setBanyoSayisi(2);
        ev1.setBinaYılı(2015);
        ev1.setAidat(250);
        ev1.setDublex(false);
        ev1.setEsyali(false);
        ev1.setHasOtopark(true);
        ev1.setHasAsansör(true);
        ev1.setHasKlima(false);

        Ev ev2= new Ev("İstanbul","Ataşehir","Kozyatağı",4,2,2,200,2005,true,true,false,false,true);
        System.out.println(ev1);
        System.out.println("---------------");
        System.out.println(ev2);


    }
}

package com.renova.builder;


// Bu pattern yardımıyla daha okunabilir bir yapı sağlıyor.
// Gerekli ve opsiyonel alanları belirleyip ona göre constructlar oluşturabiliyoruz.
// nesnenin değişmezliği koruyabiliyoruz.

public class MainV2 {

    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startBuild("Ankara", "Çankaya","Söğütözü",6)
                .setBalkonSayisi(2)
                .setDublex(false).build();

        System.out.println(ev1);

        Ev ev2 = EvBuilder.startDublexEv("İstanbul", "Ataşehir","Kozyatağı",4)
                .setBalkonSayisi(2)
                .setAidat(300)
                .setBinaYılı(2017)
                .build();

        System.out.println(ev2);

        Ev ev3 = EvBuilder.startHavuzluEv("Ankara", "Çankaya", "Atatürk", 6)
                .setAidat(200)
                .build();
        System.out.println(ev3);
    }
}

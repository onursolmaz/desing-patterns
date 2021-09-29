package com.renova.strategy;

public class EsitAgirlikStrateji implements SinavStatejisi {


    @Override
    public EnumDers getFirst() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getSecond() {
        return EnumDers.MATEMATİK;
    }
}

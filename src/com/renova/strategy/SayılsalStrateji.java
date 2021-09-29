package com.renova.strategy;

public class SayılsalStrateji implements SinavStatejisi {


    @Override
    public EnumDers getFirst() {
        return EnumDers.MATEMATİK;
    }

    @Override
    public EnumDers getSecond() {
        return EnumDers.FEN;
    }
}

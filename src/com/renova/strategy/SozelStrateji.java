package com.renova.strategy;

public class SozelStrateji implements SinavStatejisi {



    @Override
    public EnumDers getFirst() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getSecond() {
        return EnumDers.SOSYAL;
    }
}

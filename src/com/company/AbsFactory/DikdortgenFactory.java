package com.company.AbsFactory;

public class DikdortgenFactory implements SekilFactory{
    @Override
    public Rounded createRounded(int id, int k,int t) {
        return new RoundedDikdortgen(id,k,t);
    }

    @Override
    public Normal createNormal(int id, int k,int t) {
        return new NormalDikdortgen(id,k,t);
    }
}

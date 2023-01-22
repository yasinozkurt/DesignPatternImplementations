package com.company.AbsFactory;

public class KareFactory implements  SekilFactory{
    @Override
    public Rounded createRounded(int id, int k,int t) {
        return new RoundedKare(id,k,t);
    }

    @Override
    public Normal createNormal(int id, int k,int t) {
        return new NormalKare( id,  k, t);
    }
}

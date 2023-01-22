package com.company.AbsFactory;

public interface SekilFactory {

    Rounded createRounded(int id, int k,int t);
    Normal createNormal(int id, int k,int t);
}

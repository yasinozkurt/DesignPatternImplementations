package com.company.Adapter;

public class Adapter implements Tire {

    Wings w;

    public Adapter(Wings w){
        this.w=w;
    }


    @Override
    public void ride() {
        w.fly();
    }
}

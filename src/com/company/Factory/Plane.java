package com.company.Factory;

public class Plane implements  Craft{

    int Speed;
    @Override
    public void setSpeed(int s) {
        this.Speed=s;

    }

    @Override
    public int getSpeed() {
        return Speed;
    }
    public void TestIfItWorks(){
        System.out.println("It worked !!, plane created");
    }
}

package com.company.Adapter;

public class Car {

    Tire tekerlek;

    public Car(Tire t){
        tekerlek=t;
    }


    public void Drive(){
        tekerlek.ride();
    }
}

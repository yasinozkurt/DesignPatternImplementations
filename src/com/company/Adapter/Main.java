package com.company.Adapter;

public class Main {


    public static void main(String[] args) {

        Car car1= new Car(new SnowTire());

        car1.Drive();





        // araba doğrudan wings2i kullanamadığı için adapter ile birleştirdik
        // adapter ortak interface i alıyor ve gizli classın methodunu ortak interacein methoduymuş gibi yutturuyor

        Adapter wingsToTireAdapter =  new Adapter(new Wings());

        Car car2=new Car(wingsToTireAdapter);

        car2.Drive();




    }





}

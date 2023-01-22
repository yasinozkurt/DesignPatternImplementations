package com.company.AbsFactory;

public class main {

    public static void main(String[] args) {
        System.out.println("çalışıyor...");


        SekilFactory factory1 = new KareFactory();

        SekilFactory factory2= new DikdortgenFactory();



        factory1.createRounded(1,5,0).bilgiYazdır();

        System.out.println("-------------");

        factory2.createNormal(2,8,1).bilgiYazdır();


















    }




}

package com.company.Builder;

public class Main {


    public static void main(String[] args) {



        //TEST
        PhoneBuilder iphoneBuilder=new PhoneBuilder();
        iphoneBuilder.BuildColor("yellow");
        iphoneBuilder.BuildOs("OsX");
        iphoneBuilder.BuildMemory(16);




        ComputerBuilder pcBuilder=new ComputerBuilder();
        pcBuilder.BuildOs("Windows");
        pcBuilder.BuildProcessor("intel");




        Director engineer=new Director();


        engineer.setProductBuilder(iphoneBuilder);
        System.out.println(engineer.Build().toString());

        //--------------------------------
        System.out.println("-----------------------------------------");

        engineer.setProductBuilder(pcBuilder);
        System.out.println(engineer.Build().toString());


    }
}

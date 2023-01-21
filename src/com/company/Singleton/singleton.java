package com.company.Singleton;

public class singleton {


    private static singleton instance;



    private singleton(){
        System.out.println("object is created");
    }



    public static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
            return instance;

        }
        else{
            System.out.println("returned existing instance");
            return instance;

        }


    }
}

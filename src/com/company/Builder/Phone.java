package com.company.Builder;

public class Phone implements Product{


    private String os;
    private int ram;
    private int memory;
    private String color;
    private String pixel;



    public  Phone(String os, int ram, int memory,String color,String pixel){
        this.os=os;
        this.ram=ram;
        this.memory=memory;
        this.color=color;
        this.pixel=pixel;


    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", pixel='" + pixel + '\'' +
                '}';
    }
}

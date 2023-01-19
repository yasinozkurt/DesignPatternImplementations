package com.company.Builder;

public class Computer implements Product{

    private String os;
    private int ram;
    private int ssd;
    private String screenSize;
    private String processor;



    public  Computer(String os, int ram, int ssd,String screenSize,String processor){
        this.os=os;
        this.ram=ram;
        this.ssd=ssd;
        this.screenSize=screenSize;
        this.processor=processor;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", screenSize='" + screenSize + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}

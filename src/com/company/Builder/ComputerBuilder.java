package com.company.Builder;

public class ComputerBuilder implements Builder{

    private String os;
    private int ram;
    private int ssd;
    private String screenSize;
    private String processor;

    public Product getProduct(){
        return  new Computer(os,ram,ssd,screenSize,processor);
    }



    public Builder BuildOs(String os) {
        this.os=os;
        return this;
    }
    public ComputerBuilder BuildRam(int ram){
        this.ram=ram;
        return this;
    }
    public ComputerBuilder BuildSSD(int ssd){
        this.ssd=ssd;
        return this;
    }
    public ComputerBuilder BuildScreenSize(String ss){
        this.screenSize=ss;
        return this;
    }
    public ComputerBuilder BuildProcessor(String p){
        this.processor=p;
        return this;
    }

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", screenSize='" + screenSize + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}

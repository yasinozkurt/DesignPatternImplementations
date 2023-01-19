package com.company.Builder;

public class PhoneBuilder implements Builder {

    private String os;
    private int ram;
    private int memory;
    private String color;
    private String pixel;


    public Product getProduct(){

        return  new Phone(os,ram,memory,color,pixel);
    }


    public Builder BuildOs(String os) {
        this.os=os;
        return this;
    }

    public Builder BuildRam(int ram) {
        this.ram=ram;
        return this;
    }
    public Builder BuildMemory(int memory) {
        this.memory=memory;
        return this;
    }
    public Builder BuildColor(String color) {
        this.color=color;
        return this;
    }
    public Builder BuildPixel(String pixel) {
        this.pixel=pixel;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", pixel='" + pixel + '\'' +
                '}';
    }
}

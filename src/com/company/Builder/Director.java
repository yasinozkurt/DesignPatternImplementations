package com.company.Builder;

public class Director {
    Builder productBuilder;


    public void setProductBuilder(Builder pb){
        this.productBuilder=pb;
    }

    public Product Build(){
        return this.productBuilder.getProduct();

    }
}

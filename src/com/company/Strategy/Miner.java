package com.company.Strategy;

public class Miner {

    Mine mineType;


    public Miner(){
        System.out.println("Mining will start soon..");
    }


    public void  setMiningType(Mine m){
        this.mineType=m;
    }

    public void Mine(){
        mineType.mine();
    }

}

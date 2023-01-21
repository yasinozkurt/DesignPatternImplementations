package com.company.Strategy;

public class Main {

    public static void main(String[] args) {


        Miner myMiner= new Miner();

        System.out.println("----------------------------");
        System.out.println("----------------------------");


        myMiner.setMiningType(new MineCoal());
        myMiner.Mine();
        System.out.println("----------------------------");
        myMiner.setMiningType(new MineGold());
        myMiner.Mine();
    }
}

package com.company.AbsFactory;

public class NormalKare implements Normal{
    int Id;
    int kenarUzunluğu;
    int tip;

    public NormalKare(int id, int kenar, int tip){
        this.Id=id;
        this.kenarUzunluğu=kenar;
        this.tip=tip;

    }

    @Override
    public int getKenarUzunluğu() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getTip() {
        return 0;
    }

    @Override
    public void bilgiYazdır() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "NormalKare{" +
                "Id=" + Id +
                ", kenarUzunluğu=" + kenarUzunluğu +
                ", tip=" + tip +
                '}';
    }
}

package com.company.Factory;

public class OzkurtAerospace extends OzkurtIndustries{
    @Override
    //birden fazla roket tipi olsaydı burada enum ya da string gibi bir tip alarak runtime da switch case ile karar verebilirdik ne üreteceğimize
    Craft createCraft() {
        return new Rocket();
    }
}

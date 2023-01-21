package com.company.Factory;

public class OzkurtAeronautics extends OzkurtIndustries {
    @Override
    Craft createCraft() {
        return new Plane();
    }
}

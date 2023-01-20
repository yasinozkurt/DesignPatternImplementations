package com.company.Template;

public class user  extends PersonAbstract{

    boolean admin(){return false;}
    boolean mod(){return false;}
    boolean user(){return true;}

    @Override
    void performAdministration() {

        System.out.println("NOT ALLOWED!!");

    }

    @Override
    void performModeration() {

        System.out.println("NOT ALLOWED!!");

    }

    @Override
    void performSimpleSurf() {
        System.out.println("simple surf");

    }
}

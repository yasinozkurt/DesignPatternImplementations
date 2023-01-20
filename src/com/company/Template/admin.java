package com.company.Template;

public class admin extends  PersonAbstract{
    boolean admin(){return true;}
    boolean mod(){return true;}
    boolean user(){return true;}

    @Override
    void performAdministration() {
        System.out.println("administration has been performed");
    }

    @Override
    void performModeration() {

        System.out.println("moderation has been performed");

    }

    @Override
    void performSimpleSurf() {

        System.out.println("simple surf");

    }
}

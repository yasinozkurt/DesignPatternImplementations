package com.company.Template;

public class moderator extends  PersonAbstract{
    boolean admin(){return false;}
    boolean mod(){return true;}
    boolean user(){return false;}
    @Override
    void performAdministration() {

        System.out.println("NOT ALLOWED!!");

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

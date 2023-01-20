package com.company.Template;

public class Main {
    public static void main(String[] args) {


        PersonAbstract admin1= new admin();
        PersonAbstract moderator1= new moderator();
        PersonAbstract user1=new user();


        admin1.tryToAccess();

        System.out.println("*******************************");

        moderator1.tryToAccess();

        System.out.println("*******************************");

        user1.tryToAccess();

    }

}

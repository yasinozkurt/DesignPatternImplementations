package com.company.Composite;

public class Main {

    public static void main(String[] args) {



        Folder Projeler  = new Folder("Projeler",true,false);
        Folder Proje1 = new Folder("Proje1",false,true);
        Folder Proje2  = new Folder("Proje2",true,false);

        Component aciklamaFile = new File("aciklama.docx",true,false);
        Component p1file = new File("Proje1.docx",true,false);
        Component  p2file = new File("Proje2.docx",true,false);



        Proje1.addComponent(p1file);
        Proje2.addComponent(p2file);
        Projeler.addComponent(Proje1);
        Projeler.addComponent(Proje2);
        Projeler.addComponent(aciklamaFile);




        Projeler.printName();





    }
}

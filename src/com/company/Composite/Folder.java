package com.company.Composite;

import java.util.ArrayList;

public class Folder implements Component{

    String name;
    boolean readOnly;
    boolean priv;
    ArrayList<Component> CList=new ArrayList();

    public Folder(String name, boolean readOnly, boolean priv) {
        this.name = name;
        this.readOnly = readOnly;
        this.priv = priv;
    }


    public void addComponent(Component c){
        CList.add(c);
    }
    public void removeComponent(Component c){
        CList.remove(c);
    }

    @Override
    public void printName() {
        System.out.println(name + " read only: "+ readOnly + " private: "+ priv);

        for(Component c: CList ){
            c.printName();
        }

    }


}

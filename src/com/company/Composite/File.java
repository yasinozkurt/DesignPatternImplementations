package com.company.Composite;

public class File implements Component{


    String name;
    boolean readOnly;
    boolean priv;

    public File(String name, boolean readOnly, boolean priv) {
        this.name = name;
        this.readOnly = readOnly;
        this.priv = priv;
    }

    @Override
    public void printName() {
        System.out.println("name : "+ name + "  type::" + " read only : "+ readOnly+ " private : "+priv);


    }


}

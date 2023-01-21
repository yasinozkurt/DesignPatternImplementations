package com.company.Factory;


// bu methodu craft'ı da spacecraft ve aircraft olarak ikiye bölseydik özelliklerini daha iyi göstermiş olurduk.
//kullanıcı runtime'da bir tip belirtip istediği craftı üretebilirdi. Ama bu özelliği eklemedim.
public class Main {

    public static void main(String[] args) {



        OzkurtIndustries fac1= new OzkurtAeronautics();
        OzkurtIndustries fac2= new OzkurtAerospace();

        fac1.createCraft().TestIfItWorks();

        fac2.createCraft().TestIfItWorks();


    }
}

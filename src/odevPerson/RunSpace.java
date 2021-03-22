package odevPerson;



public class RunSpace {
    public static void main(String[] args) {


        person1();
        System.out.println("-----");

      //  person2();
        System.out.println("-----");
        //person3();



    }
    public static void person1(){
        person burak=new person("burak",
                "yılmaz",1234567,new cocuk("eylül","yılmaz",5,false));
        araba bmw=new araba("bmw",2009,5000);
        burak.arabas.add(bmw);
        System.out.println(burak.toString());
        //cocugun yas ve ogrencilik durumunu değistirelim ve run edelim
        burak.cocuk1.setYas(8);
        burak.cocuk1.setOgrenciMi(true);
        System.out.println(burak.toString());

    }
    public static void person2(){

        person samet=new person("samet",
                "yaprak",4123456, new cocuk("berke","yaprak",12,true));
        araba golf=new araba("golf",2010,4500);
        araba tofas=new araba("tofas",2010,4500);
        samet.arabas.add(golf);
        samet.arabas.add(tofas);
        System.out.println(samet.toString());

    }
    public static void person3(){

        person nazim=new person("nazim",
                "yıldırım",663466, new cocuk("azra","yıldırım",7,true));

        araba sahin=new araba("sahin",2010,4500);
        araba ferrari=new araba("ferrari",2020,45000);
        araba mini=new araba("mini",2010,35000);
        nazim.arabas.add(sahin);
        nazim.arabas.add(ferrari);
        nazim.arabas.add(mini);
        System.out.println(nazim.toString());

    }



}

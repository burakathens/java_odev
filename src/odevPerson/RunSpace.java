package odevPerson;

import java.util.ArrayList;

public class RunSpace {
    public static void main(String[] args) {


        person burak=new person("burak",
                "yılmaz",1234567,new cocuk("eylül","yılmaz",5,false));
        person samet=new person("samet",
                "yaprak",4123456, new cocuk("berke","yaprak",12,true));
        person nazım=new person("nazım",
                "yıldırım",663466, new cocuk("azra","yıldırım",7,true));




        araba bmw=new araba("bmw",2009,5000);
        araba golf=new araba("golf",2010,4500);

        burak.arabas.add(golf);
        nazım.arabas.add(bmw);

        System.out.println(nazım);
        System.out.println(burak.toString());





    }



}

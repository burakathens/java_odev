package odevPerson;

import java.util.ArrayList;
import java.util.List;

public class person {
    public String p_isim;
    public String p_soyisim;
    private int id_no;
    public cocuk cocuk1=new cocuk();

    public List<araba> arabas=new ArrayList<>();

    public person(){

    }
    public person(String p_isim, String p_soyisim, int id_no){
        this.p_isim=p_isim;
        this.p_soyisim=p_soyisim;
        this.id_no=id_no;
    }
    public person(String p_isim, String p_soyisim, int id_no, cocuk cocuk){

        this.p_isim=p_isim;
        this.p_soyisim=p_soyisim;
        this.id_no=id_no;
        this.cocuk1=cocuk;


    }
   public person(String p_isim, String p_soyisim, int id_no, cocuk cocuk, ArrayList<araba> arabalar){

        this.p_isim=p_isim;
        this.p_soyisim=p_soyisim;
        this.id_no=id_no;
        this.cocuk1=cocuk;
        this.arabas=arabalar;

    }

    public void setArabas(List<araba> arabas) {
        this.arabas = arabas;
    }


    @Override
    public String toString() {
        return "person{" +
                "p_isim='" + p_isim + '\'' +
                ", p_soyisim='" + p_soyisim + '\'' +
                ", id_no=" + id_no +
                ", cocuk1=" + cocuk1 +
                ", arabas=" + arabas +
                '}';
    }

}

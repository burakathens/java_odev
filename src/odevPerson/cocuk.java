package odevPerson;

public class cocuk {
    public String isim;
    public String soyisim;
    public int yas;
    public boolean ogrenciMi;

public cocuk(){

}
    public cocuk(String isim,String soyisim,int yas,boolean ogrenciMi){
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
        this.ogrenciMi=ogrenciMi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "cocuk{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", ogrenciMi=" + ogrenciMi +
                '}';
    }
}

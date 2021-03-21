package odevPerson;

public class araba {

    public String model;
    public int yil;
    public int guncelFiyat;
    public araba(){

    }
    public araba(String modell,int yil,int guncelFiyat){
        this.model=modell;
        this.yil=yil;
        this.guncelFiyat=guncelFiyat;
    }

    public int getGuncelFiyat() {
        return guncelFiyat;
    }

    public void setGuncelFiyat(int guncelFiyat) {
        this.guncelFiyat = guncelFiyat;
    }

    @Override
    public String toString() {
        return "araba{" +
                "model='" + model + '\'' +
                ", yil=" + yil +
                ", guncelFiyat=" + guncelFiyat +
                '}';
    }
}

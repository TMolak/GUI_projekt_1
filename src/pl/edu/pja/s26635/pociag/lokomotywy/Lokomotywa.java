package pl.edu.pja.s26635.pociag.lokomotywy;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.zapis.Zapis;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Lokomotywa {

    private static int idNum = 0;
    private double predkosc;
    private String nazwa;
    private Stacja stacjaMacierzysta;
    private Stacja stacjaZrodlowa;
    private Stacja stacjaDocelowa;
    private int maxUciag;

    private int maxLiczWagonow;

    private int maxLiczWagonowEl;


    public Lokomotywa(String nazwa, Stacja stacjaMacierzysta, Stacja stacjaZrodlowa, Stacja stacjaDocelowa, int maxUciag, int maxLiczWagonow, int maxLiczWagonowEl, double predkosc) {
        this.nazwa = nazwa;
        this.stacjaMacierzysta = stacjaMacierzysta;
        this.stacjaZrodlowa = stacjaZrodlowa;
        this.stacjaDocelowa = stacjaDocelowa;
        this.maxUciag = maxUciag;
        this.maxLiczWagonow = maxLiczWagonow;
        this.maxLiczWagonowEl = maxLiczWagonowEl;
        this.predkosc = predkosc;

        ++idNum;
    }

    public Lokomotywa(String nazwa, Stacja stacjaMacierzysta, Stacja stacjaZrodlowa, Stacja stacjaDocelowa, int maxUciag, int maxLiczWagonow, int maxLiczWagonowEl) {
        this.nazwa = nazwa;
        this.stacjaMacierzysta = stacjaMacierzysta;
        this.stacjaZrodlowa = stacjaZrodlowa;
        this.stacjaDocelowa = stacjaDocelowa;
        this.maxUciag = maxUciag;
        this.maxLiczWagonow = maxLiczWagonow;
        this.maxLiczWagonowEl = maxLiczWagonowEl;

        ++idNum;

    }


    public static void zapiszLokomotywe(Lokomotywa lokomotywa) throws IOException {
        Zapis.zapiszDoPliku("lokomotywy.txt", lokomotywa.toString());
    }

    public static int getIdNum() {
        return idNum;
    }

    public static void setIdNum(int idNum) {
        Lokomotywa.idNum = idNum;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Stacja getStacjaMacierzysta() {
        return stacjaMacierzysta;
    }

    public void setStacjaMacierzysta(Stacja stacjaMacierzysta) {
        this.stacjaMacierzysta = stacjaMacierzysta;
    }

    public Stacja getStacjaZrodlowa() {
        return stacjaZrodlowa;
    }

    public void setStacjaZrodlowa(Stacja stacjaZrodlowa) {
        this.stacjaZrodlowa = stacjaZrodlowa;
    }

    public Stacja getStacjaDocelowa() {
        return stacjaDocelowa;
    }

    public void setStacjaDocelowa(Stacja stacjaDocelowa) {
        this.stacjaDocelowa = stacjaDocelowa;
    }


    public int getMaxUciag() {
        return maxUciag;
    }

    public void setMaxUciag(int maxUciag) {
        this.maxUciag = maxUciag;
    }

    public int getMaxLiczWagonow() {
        return maxLiczWagonow;
    }

    public void setMaxLiczWagonow(int maxLiczWagonow) {
        this.maxLiczWagonow = maxLiczWagonow;
    }

    public int getMaxLiczWagonowEl() {
        return maxLiczWagonowEl;
    }

    public void setMaxLiczWagonowEl(int maxLiczWagonowEl) {
        this.maxLiczWagonowEl = maxLiczWagonowEl;
    }

    public double getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(double predkosc) {
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return "Lokomotywa{" +
                "predkosc=" + predkosc +
                ", nazwa='" + nazwa + '\'' +
                ", stacjaMacierzysta=" + stacjaMacierzysta +
                ", stacjaZrodlowa=" + stacjaZrodlowa +
                ", stacjaDocelowa=" + stacjaDocelowa +
                ", maxUciag=" + maxUciag +
                ", maxLiczWagonow=" + maxLiczWagonow +
                ", maxLiczWagonowEl=" + maxLiczWagonowEl +
                '}';
    }
}

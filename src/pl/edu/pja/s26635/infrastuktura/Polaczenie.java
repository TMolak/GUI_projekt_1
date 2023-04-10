package pl.edu.pja.s26635.infrastuktura;

import java.util.HashMap;
import java.util.List;

public class Polaczenie {

    private Stacja stacjaA;

    private Stacja stacjaB;

    private double odleglosc;

    public Polaczenie(Stacja stacjaA, Stacja stacjaB, double odleglosc) {
        this.stacjaA = stacjaA;
        this.stacjaB = stacjaB;
        this.odleglosc = odleglosc;
    }

    public Stacja getStacjaA() {
        return stacjaA;
    }

    public void setStacjaA(Stacja stacjaA) {
        this.stacjaA = stacjaA;
    }

    public Stacja getStacjaB() {
        return stacjaB;
    }

    public void setStacjaB(Stacja stacjaB) {
        this.stacjaB = stacjaB;
    }

    public double getOdleglosc() {
        return odleglosc;
    }

    public void setOdleglosc(double odleglosc) {
        this.odleglosc = odleglosc;
    }
}

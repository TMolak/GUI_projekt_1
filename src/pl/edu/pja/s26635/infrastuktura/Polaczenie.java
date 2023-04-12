package pl.edu.pja.s26635.infrastuktura;


public class Polaczenie {

    private String nazwaPolaczenia;

    private Stacja stacjaA;

    private Stacja stacjaB;

    private double odleglosc;

    public Polaczenie(Stacja stacjaA, Stacja stacjaB, double odleglosc) {
        this.nazwaPolaczenia = stacjaA.getNazwaStacji() +" - "+ stacjaB.getNazwaStacji();
        this.stacjaA = stacjaA;
        this.stacjaB = stacjaB;
        this.odleglosc = odleglosc;
    }

    public String getNazwaPolaczenia() {
        return nazwaPolaczenia;
    }

    public void setNazwaPolaczenia(String nazwaPolaczenia) {
        this.nazwaPolaczenia = nazwaPolaczenia;
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

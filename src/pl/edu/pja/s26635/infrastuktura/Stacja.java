package pl.edu.pja.s26635.infrastuktura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stacja {

    private String nazwaStacji;

    private List<Polaczenie> polaczenia;

    public Stacja(String nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
        polaczenia = new ArrayList<Polaczenie>();
    }

    public void dodajPolaczenie(Polaczenie polaczenie){
        polaczenia.add(polaczenie);
    }

    public String getNazwaStacji() {
        return nazwaStacji;
    }


    public List<Polaczenie> getPolaczenia() {
        return polaczenia;
    }

    public void setPolaczenia(List<Polaczenie> polaczenia) {
        this.polaczenia = polaczenia;
    }

    public void setNazwaStacji(String nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
    }

    @Override
    public String toString() {
        return "Stacja: " + nazwaStacji;
    }
}

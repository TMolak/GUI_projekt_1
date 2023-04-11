package pl.edu.pja.s26635.infrastuktura;

import java.util.ArrayList;
import java.util.List;

public class Linia {

    private String nazwaLini;

    private Stacja koncowa;

    private Stacja poczatkowa;
    private List<Stacja> stacje;

    private List<Polaczenie> polaczenia;

    private double dlugoscTrasy;
    public Linia(String nazwaLini, Stacja poczatkowa, Stacja koncowa) {
        this.nazwaLini = nazwaLini;
        stacje = new ArrayList<Stacja>();
        polaczenia = new ArrayList<Polaczenie>();

    }

    public void wyznaczanieTrasy() {
        
    }
}

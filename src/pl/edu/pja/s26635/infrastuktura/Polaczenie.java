package pl.edu.pja.s26635.infrastuktura;

import java.util.HashMap;
import java.util.List;

public class Polaczenie {

    private List<Stacja> stacje;

    private HashMap<List<Stacja>, Stacja> mapaStacji;

    public Polaczenie(List<Stacja> stacje, HashMap<List<Stacja>, Stacja> mapaStacji) {
        this.stacje = stacje;
        this.mapaStacji = mapaStacji;
    }
}

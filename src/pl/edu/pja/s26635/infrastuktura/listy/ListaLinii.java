package pl.edu.pja.s26635.infrastuktura.listy;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.ArrayList;
import java.util.List;

public class ListaLinii {
    private static ListaLinii instance;
    private List<Linia> liniaList;

    public ListaLinii() {
        this.liniaList = new ArrayList<Linia>();
    }

    public static ListaLinii getInstance() {
        if (instance == null) {
            instance = new ListaLinii();
        }
        return instance;
    }

    public void dodajLinie(Linia linia) {
        liniaList.add(linia);
    }

    public static void setInstance(ListaLinii instance) {
        ListaLinii.instance = instance;
    }

    public List<Linia> getLiniaList() {
        return liniaList;
    }

    public void setLiniaList(List<Linia> liniaList) {
        this.liniaList = liniaList;
    }
}

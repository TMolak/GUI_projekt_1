package pl.edu.pja.s26635.infrastuktura.listy;

import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;

import java.util.ArrayList;
import java.util.List;

public class ListaPolaczen {
    private static ListaPolaczen instance;
    private List<Polaczenie> polaczenieList;

    public ListaPolaczen() {
        this.polaczenieList = new ArrayList<Polaczenie>();
    }

    public static ListaPolaczen getInstance(){
        if (instance == null){
            instance = new ListaPolaczen();
        }
        return instance;
    }
    public void dodajPolaczenie(Polaczenie polaczenie){
        polaczenieList.add(polaczenie);
    }

    public void usunPolaczenie(Polaczenie polaczenie){
        polaczenieList.remove(polaczenie);
    }

    public static void setInstance(ListaPolaczen instance) {
        ListaPolaczen.instance = instance;
    }

    public List<Polaczenie> getPolaczenieList() {
        return polaczenieList;
    }

    public void setPolaczenieList(List<Polaczenie> polaczenieList) {
        this.polaczenieList = polaczenieList;
    }

    public void pokazPolaczenia() {
        for (Polaczenie p : polaczenieList) {
            System.out.println(p.toString());
        }
    }
}

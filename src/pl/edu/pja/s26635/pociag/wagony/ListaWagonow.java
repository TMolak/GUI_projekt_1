package pl.edu.pja.s26635.pociag.wagony;


import java.util.ArrayList;
import java.util.List;

public class ListaWagonow {

    private static ListaWagonow instance;

    private List<Wagon> wagonList;

    private ListaWagonow(){
        wagonList = new ArrayList<Wagon>();
    }

    public static ListaWagonow getInstance(){
        if (instance == null){
            instance = new ListaWagonow();
        }
        return instance;
    }

    public void dodajWagon(Wagon wagon){
        wagonList.add(wagon);
    }

    public void usunWagon(Wagon wagon){
        wagonList.remove(wagon);
    }

    public void pokazWagony(){
        int i = 1;
        for (Wagon w : wagonList) {
            System.out.println(i + ". "+ w.toString());
            i++;
        }
    }

    public static void setInstance(ListaWagonow instance) {
        ListaWagonow.instance = instance;
    }

    public List<Wagon> getWagonList() {
        return wagonList;
    }

    public void setWagonList(List<Wagon> wagonList) {
        this.wagonList = wagonList;
    }
}

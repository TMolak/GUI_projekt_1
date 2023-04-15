package pl.edu.pja.s26635.pociag;

import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.ArrayList;
import java.util.List;

public class ListaSkladow {

    private static ListaSkladow instace;

    private List<Sklad> skladList;

    private ListaSkladow(){
        skladList = new ArrayList<Sklad>();
    }

    public static ListaSkladow getInstance(){
        if (instace == null){
            instace = new ListaSkladow();
        }
        return instace;
    }

    public void dodajSklad(Sklad sklad){
        skladList.add(sklad);
    }

    public void usunSklad(Sklad sklad){
        skladList.remove(sklad);
    }

    public void pokazSklady(){
        int i = 1;
        for (Sklad s : skladList){
            System.out.println(i + ". " + s.toString());
            i++;
        }
    }
    public static void setInstace(ListaSkladow instace) {
        ListaSkladow.instace = instace;
    }

    public List<Sklad> getSkladList() {
        return skladList;
    }

    public void setSkladList(List<Sklad> skladList) {
        this.skladList = skladList;
    }
}

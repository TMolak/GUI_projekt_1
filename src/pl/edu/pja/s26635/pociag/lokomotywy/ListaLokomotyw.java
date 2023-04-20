package pl.edu.pja.s26635.pociag.lokomotywy;

import java.util.ArrayList;
import java.util.List;

public class ListaLokomotyw {

    private static ListaLokomotyw instance;

    private List<Lokomotywa> lokomotywaList;

    private ListaLokomotyw(){
        lokomotywaList = new ArrayList<>();
    }

    public static ListaLokomotyw getInstance(){
        if (instance == null){
            instance = new ListaLokomotyw();
        }
        return instance;
    }

    public void dodajLokomotywe(Lokomotywa lokomotywa){
        lokomotywaList.add(lokomotywa);
    }

    public void usunLokomotywe(Lokomotywa lokomotywa){
        lokomotywaList.remove(lokomotywa);
    }

    public void pokazLokomotywy(){
        int i = 1;
        for (Lokomotywa l : lokomotywaList){
            System.out.println(i + ". " + l.toString());
            i++;
        }
    }

    public static void setInstance(ListaLokomotyw instance) {
        ListaLokomotyw.instance = instance;
    }

    public List<Lokomotywa> getLokomotywaList() {
        return lokomotywaList;
    }

    public void setLokomotywaList(List<Lokomotywa> lokomotywaList) {
        this.lokomotywaList = lokomotywaList;
    }
}

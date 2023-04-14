package pl.edu.pja.s26635.infrastuktura.listy;

import pl.edu.pja.s26635.infrastuktura.Stacja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaStacji {

    private static ListaStacji instance;

    private List<Stacja> stacjaList;

    private ListaStacji(){
        stacjaList = new ArrayList<>();
    }

    public static ListaStacji getInstance(){
        if (instance == null){
            instance = new ListaStacji();
        }
        return instance;
    }

    public void dodajStacje(Stacja stacja){
        stacjaList.add(stacja);
    }

    public void usunStacje(Stacja stacja){
        stacjaList.remove(stacja);
    }

    public void listaStacjizPliku(String nazwaPliku) {
        File file = new File("C:\\Users\\tomek\\IdeaProjects\\GUI_projekt_1\\src\\plikiTxt\\", nazwaPliku);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                Stacja stacja = new Stacja(line);
                stacjaList.add(stacja);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void pokazStacje(){
        int i = 1;
        for (Stacja s: stacjaList) {
            System.out.println(i + ". "+ s.getNazwaStacji());
            i++;
        }
    }

    public static void setInstance(ListaStacji instance) {
        ListaStacji.instance = instance;
    }

    public List<Stacja> getStacjaList() {
        return stacjaList;
    }

    public void setStacjaList(List<Stacja> stacjaList) {
        this.stacjaList = stacjaList;
    }
}

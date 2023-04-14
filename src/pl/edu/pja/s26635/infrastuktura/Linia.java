package pl.edu.pja.s26635.infrastuktura;

import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Linia {

    private String nazwaLini;

    private Stacja poczatkowa;

    private Stacja koncowa;

    private List<Stacja> trasaPrzejazdu;

    private double dlugoscTrasy;
    public Linia(Stacja poczatkowa, Stacja koncowa) {
        this.nazwaLini = poczatkowa + " - " + koncowa;
//        trasaPrzejazdu =

//        dlugoscTrasy =

    }

    public List<Stacja> wyznaczanieTrasy(Stacja A, Stacja B) {
        Map<Stacja, Polaczenie> mapaStacji = new HashMap<>();
        Stacja aktualnaStacja = A;


        if (aktualnaStacja == null){

        }
return null;

    }

    public void tworzeniePolaczenMiedzyStacjami(){
        ListaStacji listaStacji = ListaStacji.getInstance();
        List<Stacja> listaStajci2 = listaStacji.getStacjaList();
        int rozmiarTablicy = listaStacji.getStacjaList().size();
        int[][] tablica = new int[rozmiarTablicy][rozmiarTablicy];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (i == j) {
                    tablica[i][j] = 0;
                } else {
                    int procent = (int) (Math.random()*101);
                    if (procent < 25){
                        tablica[i][j] = 1;
                        tablica[j][i] = 1;
                    }else{
                        tablica[i][j] = 0;
                        tablica[j][i] = 0;
                    }
                }
            }
        }

            for (int i = 0; i < tablica.length; i++) {
                for (int j = 0; j < tablica.length; j++) {
                    if (tablica[i][j] == 1){
                        double odleglosc = (Math.random()*1000);
                        listaStajci2.get(i).dodajPolaczenie(new Polaczenie(listaStajci2.get(i), listaStajci2.get(j), odleglosc));
                    }
                }

            }

    }
}

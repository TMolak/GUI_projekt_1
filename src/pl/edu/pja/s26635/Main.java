package pl.edu.pja.s26635;

import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPocz;

public class Main {


    public static void main(String[] args) {

        ListaStacji listaStacji = ListaStacji.getInstance();
        //wczytanie stacji z pliku
        listaStacji.listaStacjizPliku("100miast.txt");

        WagonPas wagonPas = new WagonPas("pp", 100, 150, 200, 250, true, 30);
        WagonPas wagonPas2 = new WagonPas("pp2", 100, 2000, 200, 250, true, 30);
        WagonPas wagonPas3 = new WagonPas("pp3", 100, 180, 200, 250, true, 30);
        WagonPocz wagonPocz = new WagonPocz("ojj", 100, 140, 300, 320, 10, true);
        WagonPocz wagonPocz2 = new WagonPocz("ojj", 100, 190, 300, 320, 10, true);

        ListaWagonow listaWagonow = ListaWagonow.getInstance();
        listaWagonow.dodajWagon(wagonPas);
        listaWagonow.dodajWagon(wagonPas2);
        listaWagonow.dodajWagon(wagonPas3);
        listaWagonow.dodajWagon(wagonPocz);
        listaWagonow.dodajWagon(wagonPocz2);
        listaWagonow.pokazWagony();

        Lokomotywa lokomotywa = new Lokomotywa("Maks", new Stacja("wawa melanz"), new Stacja("dupa"), new Stacja("ddd"), 900, 6, 2, 100);
        ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();
        listaLokomotyw.dodajLokomotywe(lokomotywa);

//        Witaj.start();

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
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

    }

}
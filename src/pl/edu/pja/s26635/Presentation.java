package pl.edu.pja.s26635;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.Wagon;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPocz;
import pl.edu.pja.s26635.pociag.wagony.towarowe.WagonGaz;
import pl.edu.pja.s26635.pociag.wagony.towarowe.WagonToxic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Presentation {
    public static void main(String[] args) {
        ListaStacji listaStacji = ListaStacji.getInstance();
        //wczytanie stacji z pliku
        listaStacji.listaStacjizPliku("100miast.txt");
        //utworzenie polaczen
        Linia.tworzeniePolaczenMiedzyStacjami();
        //25 lokomotyw
        ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();

        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            int min = 0;
            int max = listaStacji.getStacjaList().size() - 1;
            int uciag = random.nextInt(1000) + 3000;
            int liczbaWagonow = random.nextInt(10) + 25;
            int liczbaWagonowEl = random.nextInt(1) + 5;
            int predkosc = random.nextInt(50) + 150;

            Lokomotywa lokomotywa1 = new Lokomotywa("Lokomotywa " + i + 1, listaStacji.getStacjaList().get(random.nextInt(max - min + 1) + min),
                    listaStacji.getStacjaList().get(random.nextInt(max - min + 1) + min),
                    listaStacji.getStacjaList().get(random.nextInt(max - min + 1) + min),
                    uciag, liczbaWagonow, liczbaWagonowEl, predkosc
            );
            listaLokomotyw.getLokomotywaList().add(lokomotywa1);
        }
        ListaLokomotyw.getInstance().pokazLokomotywy();
        //tworzenie wagonow
        WagonPas wagonPas = new WagonPas("pp", 100, 150, 200, 250, true, 30);
        WagonPas wagonPas2 = new WagonPas("pp2", 100, 2000, 200, 250, true, 30);
        WagonPas wagonPas3 = new WagonPas("pp3", 100, 180, 200, 250, true, 30);
        WagonPocz wagonPocz = new WagonPocz("ojj", 100, 140, 300, 320, 10, true);
        WagonPocz wagonPocz2 = new WagonPocz("ojj", 100, 190, 300, 320, 10, true);
        WagonToxic wagonToxic = new WagonToxic("pkp", 50, 80, 0, 0, true, true);
        WagonGaz wagonGaz = new WagonGaz("orlen", 30, 60, 0, 0, 60, "Ziemny");
        ListaWagonow listaWagonow = ListaWagonow.getInstance();
        listaWagonow.dodajWagon(wagonPas);
        listaWagonow.dodajWagon(wagonPas2);
        listaWagonow.dodajWagon(wagonPas3);
        listaWagonow.dodajWagon(wagonPocz);
        listaWagonow.dodajWagon(wagonPocz2);
        listaWagonow.dodajWagon(wagonToxic);
        listaWagonow.dodajWagon(wagonGaz);
        listaWagonow.pokazWagony();

        //tworzenie skladow
        ListaSkladow listaSkladow = ListaSkladow.getInstance();
        for (int i = 0; i < 25; i++) {
            List<Wagon> wagony = new ArrayList<Wagon>();
            int liczbaWagonow = random.nextInt(5) + 5;

            for (int j = 0; j < liczbaWagonow; j++) {
                int nrWagonu = random.nextInt(7);
                wagony.add(listaWagonow.getWagonList().get(nrWagonu));
            }
            Sklad sklad = new Sklad(listaLokomotyw.getLokomotywaList().get(i), wagony);
            listaSkladow.getSkladList().add(sklad);
        }

        ListaSkladow.getInstance().pokazSklady();

        //przejscie do Menu aplikacji
        Witaj.start();
    }
}

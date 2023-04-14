package pl.edu.pja.s26635;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
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
        listaStacji.listaStacjizPliku("test.txt");

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

        Linia linia = new Linia(null, null);
        linia.tworzeniePolaczenMiedzyStacjami();

        for (Stacja s : listaStacji.getStacjaList()) {
            System.out.println(s.toString());
            for (Polaczenie p : s.getPolaczenia()) {
                System.out.println(p);
            }
        }
    }

}
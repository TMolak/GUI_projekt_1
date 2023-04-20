package pl.edu.pja.s26635;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaPolaczen;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.infrastuktura.przejazdy.Przejazd;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.Wagon;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPocz;


import java.util.ArrayList;
import java.util.List;

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

          Linia.tworzeniePolaczenMiedzyStacjami();

        for (Stacja s : listaStacji.getStacjaList()) {
            System.out.println(s.toString());
            for (Polaczenie p : s.getPolaczenia()) {
                System.out.println(p);

            }
        }
        List<Wagon> testoweWagony = new ArrayList<>();
        testoweWagony.add(wagonPas2);
        testoweWagony.add(wagonPas3);
       Lokomotywa lokomotywa1 = new Lokomotywa("Maks", ListaStacji.getInstance().getStacjaList().get(2), ListaStacji.getInstance().getStacjaList().get(3), ListaStacji.getInstance().getStacjaList().get(6), 900, 6, 2, 100);
        Lokomotywa lokomotywa2 = new Lokomotywa("Kama", ListaStacji.getInstance().getStacjaList().get(4), ListaStacji.getInstance().getStacjaList().get(5), ListaStacji.getInstance().getStacjaList().get(7), 900, 6, 2, 140);
        Sklad ska = new Sklad(lokomotywa1, testoweWagony);
        System.out.println("///////////////////////////////");
        for (Polaczenie p : ska.getTrasaPrzejazdu()) {
            System.out.println(p.toString());
        }
        System.out.println("///////////////////////////////");
        List<Polaczenie> list = ListaPolaczen.getInstance().getPolaczenieList();
        for (Polaczenie p : list) {
            System.out.println(p.toString());
        }
//        uruchomieniePrzejazdow(ska);
    }
    public static void uruchomieniePrzejazdow(Sklad sklad){
        System.out.println("Uruchomiono przejazdy");
//        List<Thread> listaWatkow = new ArrayList<>();
//        Lokomotywa lokomotywa1 = new Lokomotywa("Maks", ListaStacji.getInstance().getStacjaList().get(2), ListaStacji.getInstance().getStacjaList().get(3), ListaStacji.getInstance().getStacjaList().get(6), 900, 6, 2, 100);
//        Lokomotywa lokomotywa2 = new Lokomotywa("Kama", ListaStacji.getInstance().getStacjaList().get(4), ListaStacji.getInstance().getStacjaList().get(5), ListaStacji.getInstance().getStacjaList().get(7), 900, 6, 2, 140);
//
        Przejazd przejazd = new Przejazd();

        Thread thread = new Thread(() -> przejazd.zmianaPredkosci(sklad));
        Thread thread1 = new Thread(() -> przejazd.aktualnaPozycja(sklad));
//        Thread thread2 = new Thread(() -> przejazd.zmianaPredkosci(lokomotywa2));

        thread.start();
        thread1.start();

//        thread2.start();


    }
}
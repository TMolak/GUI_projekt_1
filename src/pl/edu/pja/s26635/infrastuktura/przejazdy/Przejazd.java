package pl.edu.pja.s26635.infrastuktura.przejazdy;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Przejazd {


    public void zmianaPredkosci(Sklad sklad) {
        Lokomotywa lokomotywa = sklad.getLokomotywa();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }

            System.out.println(lokomotywa.getPredkosc() + lokomotywa.getNazwa());

            double random = Math.random();
            if (random > 0.5) {
                lokomotywa.setPredkosc(lokomotywa.getPredkosc() * 1.03);
            } else {
                lokomotywa.setPredkosc(lokomotywa.getPredkosc() * 0.97);
            }
        }
    }

    public void aktualnaPozycja(Sklad sklad) {
        Lokomotywa lokomotywa = sklad.getLokomotywa();
        List<Polaczenie> trasa = sklad.getTrasaPrzejazdu();
        Stacja stacjaDocelowa = sklad.getLokomotywa().getStacjaDocelowa();
        Stacja stacjaStartowa = sklad.getLokomotywa().getStacjaZrodlowa();


        for (int i = 0; i < trasa.size(); i++) {
            Polaczenie aktualne = trasa.get(i);
            double odleglosc = aktualne.getOdleglosc();
            double predkosc = lokomotywa.getPredkosc();
            System.out.println("Jestem na " + trasa.get(i).getNazwaPolaczenia());

            if (aktualne.getStacjaB().equals(stacjaDocelowa)) {
                try {
                    System.out.println("Jestes na Stacji docelowej: " + aktualne.getStacjaB());
                    Thread.sleep(3000);
                    sklad.setTrasaPrzejazdu(Linia.wyznaczanieTrasy(stacjaDocelowa, stacjaStartowa));
                    System.out.println("Nowa trasa przejazdu:");
                    sklad.pokazTrase();

                    aktualnaPozycja2(sklad);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } else {
                try {
                    Thread.sleep(2000);
                    System.out.println("Dotarles na stacje " + aktualne.getStacjaB());
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            while (odleglosc > 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                odleglosc -= predkosc;
                if (odleglosc < 0) {
                    System.out.println("Odlegosc: 0");
                    System.out.println("Predkosc: " + predkosc);
                } else {
                    System.out.println("Odleglosc: " + odleglosc);
                    System.out.println("Predkosc: " + predkosc);
                }

            }
        }
    }
    public void aktualnaPozycja2(Sklad sklad) {
        Lokomotywa lokomotywa = sklad.getLokomotywa();
        List<Polaczenie> trasa = sklad.getTrasaPrzejazdu();
        Stacja stacjaDocelowa = sklad.getLokomotywa().getStacjaZrodlowa();
        Stacja stacjaStartowa = sklad.getLokomotywa().getStacjaDocelowa();


        for (int i = 0; i < trasa.size(); i++) {
            Polaczenie aktualne = trasa.get(i);
            double odleglosc = aktualne.getOdleglosc();
            double predkosc = lokomotywa.getPredkosc();
            System.out.println("Jestem na " + trasa.get(i).getNazwaPolaczenia());

            if (aktualne.getStacjaB().equals(stacjaDocelowa)) {
                try {
                    System.out.println("Jestes na Stacji docelowej: " + aktualne.getStacjaB());
                    Thread.sleep(3000);
                    sklad.setTrasaPrzejazdu(Linia.wyznaczanieTrasy(stacjaStartowa, stacjaDocelowa));
                    System.out.println("Nowa trasa przejazdu:");
                    sklad.pokazTrase();

                    aktualnaPozycja(sklad);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } else {
                try {
                    Thread.sleep(2000);
                    System.out.println("Dotarles na stacje " + aktualne.getStacjaB());
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            while (odleglosc > 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                odleglosc -= predkosc;
                if (odleglosc < 0) {
                    System.out.println("Odlegosc: 0");
                    System.out.println("Predkosc: " + predkosc);
                } else {
                    System.out.println("Odleglosc: " + odleglosc);
                    System.out.println("Predkosc: " + predkosc);
                }

            }
        }
    }
}





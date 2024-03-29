package pl.edu.pja.s26635.infrastuktura.przejazdy;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.wyjatki.RailroadHazard;

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
            try {
                if (lokomotywa.getPredkosc() > 200) {
                    throw new RailroadHazard();
                }

                System.out.println(lokomotywa.getPredkosc() + " " +  lokomotywa.getNazwa());

                double random = Math.random();
                if (random > 0.5) {
                    lokomotywa.setPredkosc(lokomotywa.getPredkosc() * 1.03);
                } else {
                    lokomotywa.setPredkosc(lokomotywa.getPredkosc() * 0.97);
                }
            }catch (RailroadHazard railroadHazard){
                System.out.println("Uwaga przekroczenie predkosci przez sklad: " + sklad.toString());
            }
        }
    }

    public void aktualnaPozycja(Sklad sklad, boolean kierunek) {
        Lokomotywa lokomotywa = sklad.getLokomotywa();
        List<Polaczenie> trasa = sklad.getTrasaPrzejazdu();
        Stacja stacjaStartowa;
        Stacja stacjaDocelowa;
        String nazwaSkladu = sklad.getLokomotywa().getNazwa();
        if (!kierunek){
            stacjaStartowa = sklad.getLokomotywa().getStacjaZrodlowa();
            stacjaDocelowa = sklad.getLokomotywa().getStacjaDocelowa();
        }else{
            stacjaStartowa = sklad.getLokomotywa().getStacjaDocelowa();
            stacjaDocelowa = sklad.getLokomotywa().getStacjaZrodlowa();
        }


        for (int i = 0; i < trasa.size(); i++) {
            Polaczenie aktualne = trasa.get(i);
            double odleglosc = aktualne.getOdleglosc();
            double predkosc = lokomotywa.getPredkosc();
            System.out.println(nazwaSkladu + trasa.get(i).getNazwaPolaczenia());

            if (aktualne.getStacjaB().equals(stacjaDocelowa)) {
                try {
                    System.out.println(nazwaSkladu + " jest na Stacji docelowej: " + aktualne.getStacjaB());
                    Thread.sleep(30000);
                    sklad.setTrasaPrzejazdu(Linia.wyznaczanieTrasy(stacjaDocelowa, stacjaStartowa));
                    System.out.println("Nowa trasa przejazdu dla lokomotywy "+ nazwaSkladu +":");
                    sklad.pokazTrase();
                    kierunek = !kierunek;
                    aktualnaPozycja(sklad, kierunek);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } else {
                try {
                    Thread.sleep(2000);
                    System.out.println(nazwaSkladu+ " dotarla na stacje " + aktualne.getStacjaB());
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            while (odleglosc > 0) {
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                odleglosc -= predkosc;
                if (odleglosc < 0) {
                    System.out.println(nazwaSkladu + " Odlegosc: 0");
                    System.out.println(nazwaSkladu + "Predkosc: " + predkosc);
                } else {
                    System.out.println(nazwaSkladu + "Odleglosc: " + odleglosc);
                    System.out.println(nazwaSkladu + "Predkosc: " + predkosc);
                }

            }
        }
    }

}





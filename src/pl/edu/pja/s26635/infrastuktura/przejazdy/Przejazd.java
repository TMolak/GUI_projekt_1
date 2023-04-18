package pl.edu.pja.s26635.infrastuktura.przejazdy;

import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaLinii;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.ArrayList;
import java.util.List;

public class Przejazd {


    public void zmianaPredkosci(Lokomotywa lokomotywa) {
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

    public void aktualnaPozycja(List<Polaczenie> trasa, Lokomotywa lokomotywa) {
        String stacja = " ";
        for (int i = 0; i < trasa.size(); i++) {
            Polaczenie aktualne = trasa.get(i);
            double odleglosc = aktualne.getOdleglosc();
            double czas = odleglosc/lokomotywa.getPredkosc();
            double ileZostalo = lokomotywa.getPredkosc()*czas;
            System.out.println("Jestem na "+ trasa.get(i));
            if (odleglosc>0){
                odleglosc -= ileZostalo;
                System.out.println(odleglosc);
            }else if (odleglosc == 0){
                try {
                    Thread.sleep(2000);
                    System.out.println("stacja");
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
}




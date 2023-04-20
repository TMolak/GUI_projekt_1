package pl.edu.pja.s26635.infrastuktura.przejazdy;

import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;

import java.util.List;

public class Przejazdy implements Runnable {

    private List<Sklad> skladyLista;

    public Przejazdy() {
        this.skladyLista = ListaSkladow.getInstance().getSkladList();
    }

    @Override
    public void run() {
        synchronized (skladyLista) {
            for (Sklad sklad : skladyLista) {
                Przejazd przejazd = new Przejazd();
                Thread t1 = new Thread(() -> {
                    przejazd.aktualnaPozycja(sklad, false);

                });
                Thread t2 = new Thread(() -> {
                    przejazd.zmianaPredkosci(sklad);
                });
                t1.start();
                t2.start();
            }
        }

    }

}

package pl.edu.pja.s26635.menu.elementy;

import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.Wagon;
import pl.edu.pja.s26635.wyjatki.ZaDuzaWagaWagonow;
import pl.edu.pja.s26635.wyjatki.ZaDuzoWagonow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TworzenieSkladu {
    public static void tworzenieSkladu() {
        Scanner scanner = new Scanner(System.in);
        List<Wagon> listaWybranychWagonow = new ArrayList<Wagon>();
        System.out.println("Wybierz lokomotywę do twojego skladu:");
        ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();
        listaLokomotyw.pokazLokomotywy();
        int wybranaLokomotywa = scanner.nextInt();
        Lokomotywa lokomotywa = listaLokomotyw.getLokomotywaList().get(wybranaLokomotywa-1);
        System.out.println("Wybrałeś lokomotywę " + lokomotywa.getNazwa());

        System.out.println("Wybierz Wagony");
        ListaWagonow listaWagonow = ListaWagonow.getInstance();
        listaWagonow.pokazWagony();
        do {
            int wybranyWagon = scanner.nextInt();
            Wagon wagon = listaWagonow.getWagonList().get(wybranyWagon-1);
            listaWybranychWagonow.add(wagon);
            System.out.println("Chcesz wybrac wiecej wagonow?");

        } while (scanner.nextLine().equals("Tak"));
        try {
            if (masaWagonow(listaWybranychWagonow) > lokomotywa.getMaxUciag()) {
                throw new ZaDuzaWagaWagonow();
            } else if (listaWybranychWagonow.size() + 1 > lokomotywa.getMaxLiczWagonow()) {
                throw new ZaDuzoWagonow();
            } else {
                Sklad sklad = new Sklad(lokomotywa, listaWybranychWagonow);
                ListaSkladow listaSkladow = ListaSkladow.getInstance();
                listaSkladow.dodajSklad(sklad);
            }
        } catch (ZaDuzaWagaWagonow wyjatek1) {
            System.out.println(wyjatek1);
        } catch (ZaDuzoWagonow wyjatek2) {
            System.out.println(wyjatek2.getMessage());
        }
    }

    public static int masaWagonow(List<Wagon> listaWagonow) {
        int masa = 0;
        for (int i = 0; i < listaWagonow.size(); i++) {
            masa += listaWagonow.get(i).wagaBrutto;
        }
        return masa;
    }
}

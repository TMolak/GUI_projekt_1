package pl.edu.pja.s26635.menu.przejazd;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;

import java.util.List;
import java.util.Scanner;

public class MenuPrzejazdu {
    public static void menuPrzejazdu() {
        System.out.println("Jezeli chcesz zaczac przejazd wpisz 1. Aby wrocic wpisz 0.");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {
            case "1":
                dodawaniePrzejazdow();
                break;
            case "0":
                Witaj.start();
                break;
        }
    }


    public static void dodawaniePrzejazdow() {
        ListaSkladow listaSkladow = ListaSkladow.getInstance();
        System.out.println("Menu dodawania przejazdow:");
        System.out.println("Wybierz sklad ktory ma rozpoczac przejazd:");
        listaSkladow.pokazSklady();
        Scanner scanner = new Scanner(System.in);
        int wybranySklad = scanner.nextInt()-1;
        Sklad wybranySkladDoPrzejazdu = listaSkladow.getSkladList().get(wybranySklad);
        System.out.println("Jaka trase chcesz wykonac?");
        System.out.println("Wybierz dwie stacje z listy stacji:");
        ListaStacji listaStacji = ListaStacji.getInstance();
        listaStacji.pokazStacje();
        int wybranaStacja1 = scanner.nextInt()-1;
        int wybranaStacja2 = scanner.nextInt()-1;
        Linia.tworzeniePolaczenMiedzyStacjami();
        Linia linia = new Linia(listaStacji.getStacjaList().get(wybranaStacja1), listaStacji.getStacjaList().get(wybranaStacja2));
        List<Polaczenie> trasa = linia.getTrasaPrzejazdu();

        System.out.println("Wybrana stacja przejazdu wyglada tak: ");
        for (Polaczenie p : trasa) {
            System.out.println(p.getNazwaPolaczenia());
        }
        System.out.println("Trasa bedzie miala dlugosc: " + linia.getDlugoscTrasy());
        System.out.println("Szacowany czas przejazdu wybranym pociagiem wynosi: " + ((int) linia.getDlugoscTrasy() / wybranySkladDoPrzejazdu.getLokomotywa().getPredkosc()));

    }

    public int czasPrzejazdu(double dlugoscTrasy, int predkoscPociagu) {
        return (int) dlugoscTrasy / predkoscPociagu;
    }
}

package pl.edu.pja.s26635.menu.przejazd;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.listy.ListaLinii;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.infrastuktura.przejazdy.Przejazd;
import pl.edu.pja.s26635.menu.elementy.tworzenie.Tworzenie;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.Sklad;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrzejazdu {
    public static void menuPrzejazdu() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {
            case "1":
//                dodawaniePrzejazdow();
                break;
            case "2":
                przejazdy();
                break;
            case "0":
                Witaj.start();
                break;
            default:
                System.out.println("Nieprawidlowa wartosc");
                MenuPrzejazdu.menuPrzejazdu();
                break;
        }
    }


//    public static void dodawaniePrzejazdow() {
//        ListaSkladow listaSkladow = ListaSkladow.getInstance();
//        System.out.println("Menu dodawania przejazdow:");
//        System.out.println("Wybierz sklad ktory ma rozpoczac przejazd:");
//        listaSkladow.pokazSklady();
//        Scanner scanner = new Scanner(System.in);
//        int wybranySklad = scanner.nextInt() - 1;
//        Sklad wybranySkladDoPrzejazdu = listaSkladow.getSkladList().get(wybranySklad);
//
//        Linia.tworzeniePolaczenMiedzyStacjami();
//        Linia linia = new Linia(wybranySkladDoPrzejazdu.getLokomotywa().getStacjaZrodlowa(), wybranySkladDoPrzejazdu.getLokomotywa().getStacjaDocelowa());
//        ListaLinii.getInstance().dodajLinie(linia);
//        List<Polaczenie> trasa = linia.getTrasaPrzejazdu();
//
//        System.out.println("Wybrana trasa przejazdu wyglada tak: ");
//        for (Polaczenie p : trasa) {
//            System.out.println(p.getNazwaPolaczenia());
//        }
//        System.out.println("Trasa bedzie miala dlugosc: " + linia.getDlugoscTrasy());
//        System.out.println("Szacowany czas przejazdu wybranym pociagiem wynosi: " + ((int) linia.getDlugoscTrasy() / wybranySkladDoPrzejazdu.getLokomotywa().getPredkosc()));
//        System.out.println("Z gory przepraszamy za opoznienie :)");
//        menuPrzejazdu();
//    }
public static void przejazdy(){
    System.out.println("Wybierz sklady ktore maja rozpoczac przejazdy: ");
    ListaSkladow.getInstance().pokazSklady();
    List<Sklad> wybrane = new ArrayList<Sklad>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        int wybor = scanner.nextInt();
        wybrane.add(ListaSkladow.getInstance().getSkladList().get(wybor-1));
    }

}
//    public static void uruchomienieWatkow(Sklad sklad) {
//        Lokomotywa lokomotywa = sklad.getLokomotywa();
//        System.out.println("Uruchomiono przejazdy");
//        List<Thread> listaWatkow = new ArrayList<>();
//        //   Lokomotywa lokomotywa1 = new Lokomotywa("Maks", ListaStacji.getInstance().getStacjaList().get(2), ListaStacji.getInstance().getStacjaList().get(3), ListaStacji.getInstance().getStacjaList().get(6), 900, 6, 2, 100);
//        Przejazd przejazd = new Przejazd();
//
//        Thread threadPredkosc = new Thread(() -> przejazd.zmianaPredkosci(lokomotywa));
//        Thread threadPozycja = new Thread(() -> przejazd.aktualnaPozycja(lokomotywa));
//        listaWatkow.add(threadPredkosc);
//        listaWatkow.add(threadPozycja);
//        threadPredkosc.start();
//        threadPozycja.start();
//
//
//    }


}

package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.wyjatki.NieprawidlowaWartosc;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TworzenieLokomotyw {
    public static void tworzenieLokomotyw(){
        ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę");
        try {
            String nazwa = scanner.nextLine();
            System.out.println("Podaj maksymalny uciąg");
            int maxUciag = scanner.nextInt();
            System.out.println("Podaj maksymalna liczbę wagnoów");
            int maxLiczWagonow = scanner.nextInt();
            System.out.println("Podaj maksymalna liczbę wagonów elektrycznych");
            int maxLiczWagonowEl = scanner.nextInt();
            System.out.println("Wybierz stację macierzysta (wpisujac numer na konsoli)");
            ListaStacji listaStacji = ListaStacji.getInstance();
            listaStacji.pokazStacje();
            int stacjaMacierzysta = scanner.nextInt() - 1;
            Stacja stacjaMac = listaStacji.getStacjaList().get(stacjaMacierzysta);
            System.out.println("Wybierz stację poczatkowa (wpisujac numer na konsoli)");
            int stacjaPoczatkowa = scanner.nextInt() - 1;
            Stacja stacjaPocz = listaStacji.getStacjaList().get(stacjaPoczatkowa);
            System.out.println("Wybierz stację docelowa (wpisujac numer na konsoli)");
            int stacjaDocelowa = scanner.nextInt() - 1;
            Stacja stacjaDoc = listaStacji.getStacjaList().get(stacjaDocelowa);
            System.out.println("Podaj predkosc lokomotywy: ");
            int predkosc = scanner.nextInt();
            Lokomotywa lokomotywa = new Lokomotywa(nazwa, stacjaMac, stacjaPocz, stacjaDoc, maxUciag, maxLiczWagonow, maxLiczWagonowEl, predkosc);
            listaLokomotyw.dodajLokomotywe(lokomotywa);
            System.out.println("Czy chcesz zobaczyc trase tej lokomotywy?");
            Witaj.start();
        }catch (Exception e){
            System.out.println("Nieprawidlowa wartosc, zacznij od poczatku");
            tworzenieLokomotyw();
        }
    }
}

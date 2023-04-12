package pl.edu.pja.s26635.menu.elementy;

import pl.edu.pja.s26635.Main;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;

import java.util.Scanner;


public class Tworzenie {

    public static void tworzenieElementow() {
        System.out.println("Jaki element chcesz stworzyć?");
        System.out.println("1. Lokomotywa");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        System.out.println("0. Powrót");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja){
            case "1":
                ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();

                System.out.println("Podaj nazwę");
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
                int stacjaMacierzysta = scanner.nextInt()-1;
                Stacja stacjaMac = listaStacji.getStacjaList().get(stacjaMacierzysta);
                System.out.println("Wybierz stację poczatkowa (wpisujac numer na konsoli)");
                int stacjaPoczatkowa = scanner.nextInt()-1;
                Stacja stacjaPocz = listaStacji.getStacjaList().get(stacjaPoczatkowa);
                System.out.println("Wybierz stację docelowa (wpisujac numer na konsoli)");
                int stacjaDocelowa = scanner.nextInt()-1;
                Stacja stacjaDoc = listaStacji.getStacjaList().get(stacjaDocelowa);

                Lokomotywa lokomotywa = new Lokomotywa(nazwa, stacjaMac, stacjaPocz, stacjaDoc, maxUciag, maxLiczWagonow, maxLiczWagonowEl);
                listaLokomotyw.dodajLokomotywe(lokomotywa);

                System.out.println("Powrót do start");
                Witaj.start();


            case "2": TworzenieWagonow.tworzenieWagonow();
            case "3":
            case "4":
            case "5":
            case "0": Witaj.start();
        }
    }
}

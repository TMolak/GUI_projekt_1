package pl.edu.pja.s26635.menu.odczyt;

import pl.edu.pja.s26635.infrastuktura.listy.ListaPolaczen;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;

import java.util.Scanner;

public class Pokaz {
    public static void pokazElementy() {
        System.out.println("Co chcesz zobaczyc?");
        System.out.println("1. Lokomotywy");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {

            case "1":
                ListaLokomotyw.getInstance().pokazLokomotywy();
                Witaj.start();
                break;
            case "2":
                ListaWagonow.getInstance().pokazWagony();
                Witaj.start();
                break;
            case "3":
                ListaSkladow.getInstance().pokazSklady();
                Witaj.start();
                break;
            case "4":
                ListaStacji.getInstance().pokazStacje();
                Witaj.start();
                break;
            case "5":
                ListaPolaczen.getInstance().pokazPolaczenia();
                Witaj.start();
                break;
            default:
                System.out.println("Nieprawidlowa wartosc");
                Pokaz.pokazElementy();
                break;
        }
    }
}

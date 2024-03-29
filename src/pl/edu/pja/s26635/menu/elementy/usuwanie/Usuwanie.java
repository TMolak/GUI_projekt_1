package pl.edu.pja.s26635.menu.elementy.usuwanie;

import pl.edu.pja.s26635.infrastuktura.listy.ListaPolaczen;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;

import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;

import java.util.Scanner;

public class Usuwanie {
    public static void usuwanieElementu(){
        System.out.println("Co chcesz usunąć?");
        System.out.println("1. Lokomotywa");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {
            case "1":
                usunLokomotywe();
                Witaj.start();
                break;
            case "2":
                usunWagon();
                Witaj.start();
                break;
            case "3":
                usunSklad();
                Witaj.start();
                break;
            case "4":
                usunStacje();
                Witaj.start();
                break;
            case "5":
                usunPolaczenie();
                break;
            case "0":
                Witaj.start();
                break;
            default:
                System.out.println("Nieprawidlowa wartosc");
                Usuwanie.usuwanieElementu();
                break;
        }
    }

    public static void usunLokomotywe(){
        System.out.println("Wybierz lokomotywe do usuniecia: ");
        ListaLokomotyw.getInstance().pokazLokomotywy();
        Scanner scanner = new Scanner(System.in);
        int decyzja = scanner.nextInt()-1;
        ListaLokomotyw.getInstance().usunLokomotywe(ListaLokomotyw.getInstance().getLokomotywaList().get(decyzja));
        Witaj.start();
    }
    public static void  usunWagon(){
        System.out.println("Wybierz wagon do usuniecia: ");
        ListaWagonow.getInstance().pokazWagony();
        int decyzja = new Scanner(System.in).nextInt()-1;
        ListaWagonow.getInstance().usunWagon(ListaWagonow.getInstance().getWagonList().get(decyzja));
        Witaj.start();
    }
    public static void usunSklad(){
        System.out.println("Wybierz sklad do usuniecia: ");
        ListaSkladow.getInstance().pokazSklady();
        int decyzja = new Scanner(System.in).nextInt()-1;
        ListaSkladow.getInstance().usunSklad(ListaSkladow.getInstance().getSkladList().get(decyzja));
        Witaj.start();
    }
    public static void usunStacje(){
        System.out.println("Wybierz stacje do usuniecia: ");
        ListaStacji.getInstance().pokazStacje();
        int decyzja = new Scanner(System.in).nextInt()-1;
        ListaStacji.getInstance().usunStacje(ListaStacji.getInstance().getStacjaList().get(decyzja));
        Witaj.start();
    }
    public static void usunPolaczenie(){
        System.out.println("Wybierz polaczenie do usuniecia: ");
        ListaPolaczen.getInstance().pokazPolaczenia();
        int decyzja = new Scanner(System.in).nextInt()-1;
        ListaPolaczen.getInstance().usunPolaczenie(ListaPolaczen.getInstance().getPolaczenieList().get(decyzja));
        Witaj.start();
    }

}

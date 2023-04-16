package pl.edu.pja.s26635.menu.elementy.usuwanie;

import pl.edu.pja.s26635.menu.elementy.tworzenie.*;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.ListaSkladow;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;

import java.util.Scanner;

public class Usuwanie {
    public static void usuwanieElementu(){
        System.out.println("Co chcesz usunąć?");
        System.out.println("1. Wagon");
        System.out.println("2. Lokomotywa");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {
            case "1":
                usunLokomotywe();
                break;
            case "2":
                usunWagon();
                break;
            case "3":
                usunSklad();
                break;
            case "4":
                TworzenieStacji.tworzenieStacji();
                break;
            case "5":
                TworzeniePolaczen.tworzeniePolaczen();
                break;
            case "0":
                Witaj.start();
                break;
        }
    }

    public static void usunLokomotywe(){
        System.out.println("Wybierz lokomotywe do usuniecia: ");
        ListaLokomotyw.getInstance().pokazLokomotywy();
        Scanner scanner = new Scanner(System.in);
        int decyzja = scanner.nextInt();
        ListaLokomotyw.getInstance().usunLokomotywe(ListaLokomotyw.getInstance().getLokomotywaList().get(decyzja));
        Witaj.start();
    }
    public static void  usunWagon(){
        System.out.println("Wybierz wagon do usuniecia: ");
        ListaWagonow.getInstance().pokazWagony();
        Scanner scanner = new Scanner(System.in);
        int decyzja = scanner.nextInt();
        ListaWagonow.getInstance().usunWagon(ListaWagonow.getInstance().getWagonList().get(decyzja));
        Witaj.start();
    }
    public static void usunSklad(){
        System.out.println("Wybierz sklad do usuniecia: ");
        ListaSkladow.getInstance().pokazSklady();
    }

}

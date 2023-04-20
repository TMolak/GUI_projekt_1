package pl.edu.pja.s26635.menu.start;

import pl.edu.pja.s26635.menu.elementy.usuwanie.Usuwanie;
import pl.edu.pja.s26635.menu.elementy.tworzenie.Tworzenie;
import pl.edu.pja.s26635.menu.odczyt.Pokaz;
import pl.edu.pja.s26635.menu.przejazd.MenuPrzejazdu;

import java.util.Scanner;


public class Witaj {

    public static void start() {
        System.out.println("Witaj w programie!");
        System.out.println("Wybierz co chcesz zrobić wpisując odpowiedni numer z listy");
        System.out.println("1. Stworzenie nowych elementów");
        System.out.println("2. Usuwanie elementów");
        System.out.println("3. Pokaz elementy");
        System.out.println("4. Menu trasy przejazdu");
        System.out.println("0. Wyjście z programu");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();

        switch (decyzja) {
            case "1":
                Tworzenie.tworzenieElementow();
                break;
            case "2":
                Usuwanie.usuwanieElementu();
                break;
            case "3":
                Pokaz.pokazElementy();
                break;
            case "4":
                MenuPrzejazdu.menuPrzejazdu();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Nieprawidlowa wartosc!!!");
                Witaj.start();
                break;
        }
    }
}

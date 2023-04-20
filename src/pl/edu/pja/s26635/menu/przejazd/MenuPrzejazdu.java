package pl.edu.pja.s26635.menu.przejazd;


import pl.edu.pja.s26635.infrastuktura.przejazdy.Przejazdy;

import pl.edu.pja.s26635.menu.start.Witaj;

import java.util.Scanner;

public class MenuPrzejazdu {
    public static void menuPrzejazdu() {

        System.out.println("Witaj w menu przejazdu aby rozpoczac wcisnij 1");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja) {
            case "1":
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


    public static void przejazdy() {

        Przejazdy przejazdy = new Przejazdy();
        przejazdy.run();


    }


}

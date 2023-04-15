package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.menu.start.Witaj;

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
        switch (decyzja) {
            case "1":
                TworzenieLokomotyw.tworzenieLokomotyw();
                break;
            case "2":
                TworzenieWagonow.tworzenieWagonow();
                break;
            case "3":
                TworzenieSkladu.tworzenieSkladu();
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
}

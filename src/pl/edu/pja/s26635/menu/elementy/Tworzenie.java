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
            case "1": TworzenieLokomotyw.tworzenieLokomotyw();
            case "2": TworzenieWagonow.tworzenieWagonow();
            case "3": TworzenieSkladu.tworzenieSkladu();
            break;
            case "4":
            case "5":
            case "0": Witaj.start();
        }
    }
}

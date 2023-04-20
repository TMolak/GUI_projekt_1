package pl.edu.pja.s26635.menu.przejazd;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.listy.ListaLinii;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.infrastuktura.przejazdy.Przejazd;
import pl.edu.pja.s26635.infrastuktura.przejazdy.Przejazdy;
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


public static void przejazdy(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Aby rozpoczac przejazdy wpisz 1 aby wrocic 0");
    String dec = scanner.nextLine();

    switch (dec){
        case "1":
            Przejazdy przejazdy = new Przejazdy();
            przejazdy.run();

        case "0":
            menuPrzejazdu();
        default:
            System.out.println("Nieprawidlowa wartosc");
            MenuPrzejazdu.przejazdy();
            break;
    }

}



}

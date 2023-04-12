package pl.edu.pja.s26635.menu.start;

import pl.edu.pja.s26635.menu.elementy.Tworzenie;
import pl.edu.pja.s26635.menu.odczyt.Pokaz;

import java.util.Scanner;



public class Witaj {

public static void start(){
    System.out.println("Witaj w programie!");
    System.out.println("Wybierz co chcesz zrobić wpisując odpowiedni numer z listy");
    System.out.println("1. Stworzenie nowych elementów");
    System.out.println("2. Edycja elementów");
    System.out.println("3. Usuwanie elementów");
    System.out.println("4. Pokaz elementy");
    System.out.println("0. Wyjście z programu");
    Scanner scanner = new Scanner(System.in);
    String decyzja = scanner.nextLine();
    if (decyzja.equals("1")) {
        Tworzenie.tworzenieElementow();
    } else if (decyzja.equals("2")) {
        System.out.println("Co chcesz edytować?");
        System.out.println("1. Wagon");
        System.out.println("2. Lokomotywa");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
//            elementEdit();
    } else if (decyzja.equals("3")) {
        System.out.println("Co chcesz usunąć?");
        System.out.println("1. Wagon");
        System.out.println("2. Lokomotywa");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
//            elementRemove();
    }else if (decyzja.equals("4")){
        Pokaz.pokazElementy();

    } else if (decyzja.equals("0")) {
        System.exit(0);
    }
}

}

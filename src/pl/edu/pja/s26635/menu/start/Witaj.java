package pl.edu.pja.s26635.menu.start;

import pl.edu.pja.s26635.menu.Usuwanie;
import pl.edu.pja.s26635.menu.edycja.Edycja;
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
    switch (decyzja){
        case "1": Tworzenie.tworzenieElementow();
        case "2": Edycja.edytowanieElementu();
        case "3": Usuwanie.usuwanieElementu();
        case "4": Pokaz.pokazElementy();
        case "0": System.exit(0);
    }
}

}

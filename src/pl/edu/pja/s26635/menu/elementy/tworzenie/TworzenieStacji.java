package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;

import java.util.Scanner;

public class TworzenieStacji {
    public static void tworzenieStacji(){
        Scanner scanner = new Scanner(System.in);
        ListaStacji listaStacji = ListaStacji.getInstance();
        System.out.println("Podaj nazwe nowej stacji: ");
        Stacja stacja = new Stacja(scanner.nextLine());
        listaStacji.dodajStacje(stacja);
    }
}

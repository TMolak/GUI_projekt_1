package pl.edu.pja.s26635.menu.odczyt;

import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;

import java.util.Scanner;

public class Pokaz {
    public static void pokazElementy(){
        System.out.println("Co chcesz zobaczyc?");
        System.out.println("1. Lokomotywy");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        switch (decyzja){

            case "1":
                ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();
                for (int i = 0; i < listaLokomotyw.getLokomotywaList().size(); i++) {
                    System.out.println(listaLokomotyw.getLokomotywaList().get(i));
                }
            case "2":
                ListaWagonow listaWagonow = ListaWagonow.getInstance();
                for (int i = 0; i < listaWagonow.getWagonList().size(); i++) {
                    System.out.println(listaWagonow.getWagonList().get(i));
                }
        }
    }
}

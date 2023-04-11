package pl.edu.pja.s26635.menu.odczyt;

import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;

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
        if (decyzja.equals("1")){
            ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();
            for (int i = 0; i < listaLokomotyw.getLokomotywaList().size(); i++) {
                System.out.println(listaLokomotyw.getLokomotywaList().get(i));
            }
        }
    }
}

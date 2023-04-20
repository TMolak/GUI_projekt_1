package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.infrastuktura.listy.ListaPolaczen;
import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;

import java.util.Scanner;

public class TworzeniePolaczen {
    public static void tworzeniePolaczen(){
        try{
        ListaPolaczen listaPolaczen = ListaPolaczen.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz stacje z ktore chcesz polaczyc");
        ListaStacji.getInstance().pokazStacje();
        int stacjaA = scanner.nextInt()-1;
        int stacjaB = scanner.nextInt()-1;
        System.out.println("Podaj odleglosc miedzy stacjami");
        double odleglosc = scanner.nextDouble();
        Polaczenie polaczenie = new Polaczenie(ListaStacji.getInstance().getStacjaList().get(stacjaA), ListaStacji.getInstance().getStacjaList().get(stacjaB), odleglosc);
        listaPolaczen.dodajPolaczenie(polaczenie);
        Witaj.start();
        }catch (Exception e){
        System.out.println("Nieprawidlowa wartosc, zacznij od poczatku");
        tworzeniePolaczen();
    }
    }
}

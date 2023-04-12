package pl.edu.pja.s26635;


import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;
import pl.edu.pja.s26635.menu.start.Witaj;


public class Main {


    public static void main(String[] args) {

        ListaStacji listaStacji = ListaStacji.getInstance();
//wczytanie stacji z pliku
        listaStacji.listaStacjizPliku("100miast.txt");

        Witaj.start();


    }

}
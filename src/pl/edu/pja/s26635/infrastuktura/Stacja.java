package pl.edu.pja.s26635.infrastuktura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stacja {

    private String nazwaStacji;

    private List<Polaczenie> polaczenia;

    public Stacja(String nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
        polaczenia = new ArrayList<Polaczenie>();
    }

    public void dodajPolaczenie(Polaczenie polaczenie){
        polaczenia.add(polaczenie);
    }

    public String getNazwaStacji() {
        return nazwaStacji;
    }

//    public static List<Stacja> listaStacji(String fileName) {
////    String fileName = "100miast.txt";
//        List<Stacja> listaStacji = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                Stacja stacja = new Stacja(line);
//                listaStacji.add(stacja);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return listaStacji;
//    }
    public static List<Stacja> listaStacji() {
    String fileName = "100miast.txt";
        List<Stacja> listaStacji = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                Stacja stacja = new Stacja(line);
                listaStacji.add(stacja);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaStacji;
    }

    public void setNazwaStacji(String nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
    }

    @Override
    public String toString() {
        return "Stacja: " + nazwaStacji;
    }
}

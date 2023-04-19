package pl.edu.pja.s26635.infrastuktura;

import pl.edu.pja.s26635.infrastuktura.listy.ListaStacji;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Linia {

    private String nazwaLini;

    private Stacja poczatkowa;

    private Stacja koncowa;

    private List<Polaczenie> trasaPrzejazdu;

    private double dlugoscTrasy;

    public Linia(Stacja poczatkowa, Stacja koncowa) {
        this.nazwaLini = poczatkowa + " - " + koncowa;
        this.trasaPrzejazdu = wyznaczanieTrasy(poczatkowa, koncowa);
    }

    public List<Polaczenie> wyznaczanieTrasy(Stacja start, Stacja koniec) {
        List<Polaczenie> trasa = new ArrayList<Polaczenie>();

        if (start.getPolaczenia() == null || koniec.getPolaczenia() == null) {
            //zamienic na wyjatek
            return trasa;
        } else {
            Polaczenie p = start.getPolaczenia().get(0);
            trasa.add(p);
            Stacja c = p.getStacjaB();
            while (!c.equals(koniec)) {
                List<Polaczenie> listaPolaczenC = c.getPolaczenia();
                Polaczenie nastepne = null;

                for (Polaczenie p2 : listaPolaczenC) {
                    if (p2.getStacjaB().equals(koniec)) {
                        nastepne = p2;
                        break;
                    }
                }

                if (nastepne == null) {
                    nastepne = listaPolaczenC.get(0);
                    while (nastepne.getStacjaB().equals(c) || trasa.contains(nastepne)) {
                        nastepne = listaPolaczenC.get((listaPolaczenC.indexOf(nastepne) + 1) % listaPolaczenC.size());
                    }
                }
                trasa.add(nastepne);
                c = nastepne.getStacjaB();

            }
        }

        for (int i = 0; i < trasa.size(); i++) {
            this.dlugoscTrasy += trasa.get(i).getOdleglosc();
        }
        return trasa;

    }

    public static void tworzeniePolaczenMiedzyStacjami() {
        ListaStacji listaStacji = ListaStacji.getInstance();
        List<Stacja> listaStacji2 = listaStacji.getStacjaList();
        int rozmiarTablicy = listaStacji.getStacjaList().size();
        int[][] tablica = new int[rozmiarTablicy][rozmiarTablicy];
        double[][] odleglosci = new double[rozmiarTablicy][rozmiarTablicy];

        for (int i = 0; i < rozmiarTablicy; i++) {
            for (int j = i + 1; j < rozmiarTablicy; j++) {
                odleglosci[i][j] = Math.random() * 1000;
                odleglosci[j][i] = odleglosci[i][j];
            }
        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (i == j) {
                    tablica[i][j] = 0;
                } else {
                    int procent = (int) (Math.random() * 101);
                    if (procent < 25) {
                        tablica[i][j] = 1;
                        tablica[j][i] = 1;
                    } else {
                        tablica[i][j] = 0;
                        tablica[j][i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i][j] == 1) {
                    listaStacji2.get(i).dodajPolaczenie(new Polaczenie(listaStacji2.get(i), listaStacji2.get(j), odleglosci[i][j]));
                }
            }

        }

    }

    public String getNazwaLini() {
        return nazwaLini;
    }

    public void setNazwaLini(String nazwaLini) {
        this.nazwaLini = nazwaLini;
    }

    public Stacja getPoczatkowa() {
        return poczatkowa;
    }

    public void setPoczatkowa(Stacja poczatkowa) {
        this.poczatkowa = poczatkowa;
    }

    public Stacja getKoncowa() {
        return koncowa;
    }

    public void setKoncowa(Stacja koncowa) {
        this.koncowa = koncowa;
    }

    public List<Polaczenie> getTrasaPrzejazdu() {
        return trasaPrzejazdu;
    }

    public void setTrasaPrzejazdu(List<Polaczenie> trasaPrzejazdu) {
        this.trasaPrzejazdu = trasaPrzejazdu;
    }

    public double getDlugoscTrasy() {
        return dlugoscTrasy;
    }

    public void setDlugoscTrasy(double dlugoscTrasy) {
        this.dlugoscTrasy = dlugoscTrasy;
    }

    @Override
    public String toString() {
        return "Linia{" +
                "nazwaLini='" + nazwaLini + '\'' +
                ", poczatkowa=" + poczatkowa +
                ", koncowa=" + koncowa +
                ", trasaPrzejazdu=" + trasaPrzejazdu +
                ", dlugoscTrasy=" + dlugoscTrasy +
                '}';
    }
}

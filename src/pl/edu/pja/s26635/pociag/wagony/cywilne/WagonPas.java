package pl.edu.pja.s26635.pociag.wagony.cywilne;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonPas extends Wagon {

    public static boolean polaczenieElektryczne = true;
    public boolean toaleta;
    public int miejscaNaWalizki;

    public WagonPas(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonPas(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, boolean toaleta, int miejscaNaWalizki) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.toaleta = toaleta;
        this.miejscaNaWalizki = miejscaNaWalizki;
    }
}

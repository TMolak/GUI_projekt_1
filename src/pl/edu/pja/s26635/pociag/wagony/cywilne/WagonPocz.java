package pl.edu.pja.s26635.pociag.wagony.cywilne;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonPocz extends Wagon {

    public static boolean polaczenieElektryczne = true;
    public int maxWagaPrzesylek;
    public boolean wifi;

    public WagonPocz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonPocz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, int maxWagaPrzesylek, boolean wifi) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.maxWagaPrzesylek = maxWagaPrzesylek;
        this.wifi = wifi;
    }
}

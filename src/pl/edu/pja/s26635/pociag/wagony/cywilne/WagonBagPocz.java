package pl.edu.pja.s26635.pociag.wagony.cywilne;

public class WagonBagPocz extends WagonPocz {

    public int maxWagaBagazy;

    public WagonBagPocz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, int maxWagaPrzesylek, boolean wifi, int maxWagaBagazy) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, maxWagaPrzesylek, wifi);
        this.maxWagaBagazy = maxWagaBagazy;
    }
}

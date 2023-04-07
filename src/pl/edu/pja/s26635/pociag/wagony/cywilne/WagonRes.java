package pl.edu.pja.s26635.pociag.wagony.cywilne;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonRes extends Wagon {
    private static boolean polaczenieElektryczne = true;
    private boolean ofertaSniadaniowa;
    private boolean ofertaWege;
    private int iloscStolow;

    public WagonRes(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonRes(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, boolean ofertaSniadaniowa, boolean ofertaWege, int iloscStolow) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.ofertaSniadaniowa = ofertaSniadaniowa;
        this.ofertaWege = ofertaWege;
        this.iloscStolow = iloscStolow;
    }
}

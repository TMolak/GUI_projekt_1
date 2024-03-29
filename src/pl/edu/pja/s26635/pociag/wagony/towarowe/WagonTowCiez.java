package pl.edu.pja.s26635.pociag.wagony.towarowe;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonTowCiez extends Wagon {

    private static int maxLadownosc = 60000;
    private String rodzajWagonu;

    private String kolorWagonu;

    public WagonTowCiez(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonTowCiez(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, String kolorWagonu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.rodzajWagonu = rodzajWagonu;
        this.kolorWagonu = kolorWagonu;
    }
}

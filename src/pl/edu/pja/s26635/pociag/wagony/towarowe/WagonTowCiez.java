package pl.edu.pja.s26635.pociag.wagony.towarowe;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonTowCiez extends Wagon {

    public static int maxLadownosc = 60000;
    public String rodzajWagonu;

    public WagonTowCiez(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonTowCiez(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.rodzajWagonu = rodzajWagonu;
    }
}

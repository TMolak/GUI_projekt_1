package pl.edu.pja.s26635.pociag.wagony.towarowe;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

public class WagonTowPodst extends Wagon {

    public static int maxLadownosc = 50000;
    public String rodzajWagonu;

    public WagonTowPodst(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonTowPodst(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.rodzajWagonu = rodzajWagonu;
    }
}

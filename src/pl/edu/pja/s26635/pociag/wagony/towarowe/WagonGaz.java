package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonGaz extends WagonTowPodst {

    private int ilePaliNaGazie;
    private String rodzajGazu;
    public WagonGaz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonGaz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu);
    }

    public WagonGaz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, int ilePaliNaGazie, String rodzajGazu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.ilePaliNaGazie = ilePaliNaGazie;
        this.rodzajGazu = rodzajGazu;
    }

    public WagonGaz(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, int ilePaliNaGazie, String rodzajGazu) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu);
        this.ilePaliNaGazie = ilePaliNaGazie;
        this.rodzajGazu = rodzajGazu;
    }
}

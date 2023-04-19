package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonWybuch extends WagonTowCiez{

    public String dlaJakichSluzb;
    public boolean czyMoznaDoMiasta;
    public WagonWybuch(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonWybuch(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String dlaJakichSluzb, boolean czyMoznaDoMiasta) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.dlaJakichSluzb = dlaJakichSluzb;
        this.czyMoznaDoMiasta = czyMoznaDoMiasta;
    }

    public WagonWybuch(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, String kolorWagonu, String dlaJakichSluzb, boolean czyMoznaDoMiasta) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu, kolorWagonu);
        this.dlaJakichSluzb = dlaJakichSluzb;
        this.czyMoznaDoMiasta = czyMoznaDoMiasta;
    }
}

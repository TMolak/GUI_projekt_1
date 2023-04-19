package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonToxic extends WagonTowCiez{

    private boolean czyMoznaRadioaktywneOdpady;
    private boolean czySwieciWCiemnosci;

    public WagonToxic(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonToxic(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, boolean czyMoznaRadioaktywneOdpady, boolean czySwieciWCiemnosci) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.czyMoznaRadioaktywneOdpady = czyMoznaRadioaktywneOdpady;
        this.czySwieciWCiemnosci = czySwieciWCiemnosci;
    }

    public WagonToxic(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, String kolorWagonu, boolean czyMoznaRadioaktywneOdpady, boolean czySwieciWCiemnosci) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu, kolorWagonu);
        this.czyMoznaRadioaktywneOdpady = czyMoznaRadioaktywneOdpady;
        this.czySwieciWCiemnosci = czySwieciWCiemnosci;
    }
}

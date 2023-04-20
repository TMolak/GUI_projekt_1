package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonCieklToxic extends WagonTowCiez{
    private boolean czyMoznaNapojeGazowane;
    private boolean czyMoznaPaliwoLotnicze;

    public WagonCieklToxic(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, boolean czyMoznaNapojeGazowane, boolean czyMoznaPaliwoLotnicze) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.czyMoznaNapojeGazowane = czyMoznaNapojeGazowane;
        this.czyMoznaPaliwoLotnicze = czyMoznaPaliwoLotnicze;
    }

    public WagonCieklToxic(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, String kolorWagonu, boolean czyMoznaNapojeGazowane, boolean czyMoznaPaliwoLotnicze) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu, kolorWagonu);
        this.czyMoznaNapojeGazowane = czyMoznaNapojeGazowane;
        this.czyMoznaPaliwoLotnicze = czyMoznaPaliwoLotnicze;
    }
}

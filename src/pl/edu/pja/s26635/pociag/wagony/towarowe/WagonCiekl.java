package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonCiekl extends WagonTowPodst {

private boolean czyMoznaNapojeGazowane;
private boolean czyMoznaPaliwoLotnicze;
    public WagonCiekl(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonCiekl(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String rodzajWagonu, boolean czyMoznaNapojeGazowane, boolean czyMoznaPaliwoLotnicze) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc, rodzajWagonu);
        this.czyMoznaNapojeGazowane = czyMoznaNapojeGazowane;
        this.czyMoznaPaliwoLotnicze = czyMoznaPaliwoLotnicze;
    }
}

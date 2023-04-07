package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonChlod extends WagonTowPodst {

    private static boolean polaczenieElektryczne = true;
    public WagonChlod(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }
}

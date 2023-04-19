package pl.edu.pja.s26635.pociag.wagony.towarowe;

public class WagonChlod extends WagonTowPodst {

    private static boolean polaczenieElektryczne = true;
    private String reklama;

    private int minimalnTemp;

    public WagonChlod(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
    }

    public WagonChlod(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc, String reklama, int minimalnTemp) {
        super(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichMiejsc);
        this.reklama = reklama;
        this.minimalnTemp = minimalnTemp;
    }
}

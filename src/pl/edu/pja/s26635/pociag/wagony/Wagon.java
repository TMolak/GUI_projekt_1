package pl.edu.pja.s26635.pociag.wagony;

public abstract class Wagon {

    public static int idNum = 0;

    public String nadawca;

    public int wagaNetto;

    public int wagaBrutto;

    public int liczbaMiejscSiedzacych;

    public int liczbaWszystkichMiejsc;

    public Wagon(String nadawca, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych, int liczbaWszystkichMiejsc) {
        this.nadawca = nadawca;
        this.wagaNetto = wagaNetto;
        this.wagaBrutto = wagaBrutto;
        this.liczbaMiejscSiedzacych = liczbaMiejscSiedzacych;
        this.liczbaWszystkichMiejsc = liczbaWszystkichMiejsc;
        ++idNum;
    }

    public Wagon() {
    }

    public static int getIdNum() {
        return idNum;
    }

    public static void setIdNum(int idNum) {
        Wagon.idNum = idNum;
    }

    public String getNadawca() {
        return nadawca;
    }

    public void setNadawca(String nadawca) {
        this.nadawca = nadawca;
    }

    public int getWagaNetto() {
        return wagaNetto;
    }

    public void setWagaNetto(int wagaNetto) {
        this.wagaNetto = wagaNetto;
    }

    public int getWagaBrutto() {
        return wagaBrutto;
    }

    public void setWagaBrutto(int wagaBrutto) {
        this.wagaBrutto = wagaBrutto;
    }

    public int getLiczbaMiejscSiedzacych() {
        return liczbaMiejscSiedzacych;
    }

    public void setLiczbaMiejscSiedzacych(int liczbaMiejscSiedzacych) {
        this.liczbaMiejscSiedzacych = liczbaMiejscSiedzacych;
    }

    public int getLiczbaWszystkichMiejsc() {
        return liczbaWszystkichMiejsc;
    }

    public void setLiczbaWszystkichMiejsc(int liczbaWszystkichMiejsc) {
        this.liczbaWszystkichMiejsc = liczbaWszystkichMiejsc;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "nadawca='" + nadawca + '\'' +
                ", wagaNetto=" + wagaNetto +
                ", wagaBrutto=" + wagaBrutto +
                ", liczbaMiejscSiedzacych=" + liczbaMiejscSiedzacych +
                ", liczbaWszystkichMiejsc=" + liczbaWszystkichMiejsc +
                '}';
    }
}

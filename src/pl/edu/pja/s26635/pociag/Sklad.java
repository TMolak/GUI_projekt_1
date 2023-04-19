package pl.edu.pja.s26635.pociag;

import pl.edu.pja.s26635.infrastuktura.Linia;
import pl.edu.pja.s26635.infrastuktura.Polaczenie;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.Wagon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sklad {

    private Lokomotywa lokomotywa;

    private List<Wagon> wagony;

    private List<Polaczenie> trasaPrzejazdu;

    public Sklad(Lokomotywa lokomotywa, List<Wagon> wagony) {
        this.lokomotywa = lokomotywa;
        this.wagony = wagony;
        this.trasaPrzejazdu = Linia.wyznaczanieTrasy(lokomotywa.getStacjaZrodlowa(), lokomotywa.getStacjaDocelowa());

    }

    public void pokazTrase(){
        for (Polaczenie p : trasaPrzejazdu) {
            System.out.println(p.getStacjaA() + " - " + p.getStacjaB());
        }
    }
    public List<Polaczenie> getTrasaPrzejazdu() {
        return trasaPrzejazdu;
    }

    public void setTrasaPrzejazdu(List<Polaczenie> trasaPrzejazdu) {
        this.trasaPrzejazdu = trasaPrzejazdu;
    }

    public Lokomotywa getLokomotywa() {
        return lokomotywa;
    }

    public void setLokomotywa(Lokomotywa lokomotywa) {
        this.lokomotywa = lokomotywa;
    }

    public List<Wagon> getWagony() {
        return wagony;
    }

    public void setWagony(List<Wagon> wagony) {
        this.wagony = wagony;
    }

    @Override
    public String toString() {
        return "Sklad " +
                "lokomotywa " + lokomotywa.getNazwa() +
                ", wagony=" + wagony +
                '}';
    }
}

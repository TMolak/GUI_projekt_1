package pl.edu.pja.s26635.pociag;

import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;
import pl.edu.pja.s26635.pociag.wagony.Wagon;

import java.util.HashMap;
import java.util.List;

public class Sklad {

    private Lokomotywa lokomotywa;

    private List<Wagon> wagony;

    public Sklad(Lokomotywa lokomotywa, List<Wagon> wagony) {
        this.lokomotywa = lokomotywa;
        this.wagony = wagony;
    }

    public void jazda(){
        lokomotywa.setPredkosc(lokomotywa.getPredkosc()*(1.01));

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

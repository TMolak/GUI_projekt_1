package pl.edu.pja.s26635.infrastuktura.przejazdy;

import java.util.ArrayList;
import java.util.List;

public class Przejazdy {

    private List<Thread> watkiPrzejazdow;

    public Przejazdy() {
        watkiPrzejazdow = new ArrayList<>();
        Thread thread = new Thread();
        watkiPrzejazdow.add(thread);
    }

    public List<Thread> getWatkiPrzejazdow() {
        return watkiPrzejazdow;
    }

}

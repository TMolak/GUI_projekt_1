package pl.edu.pja.s26635.infrastuktura;

import java.util.List;

public class Linia {

    private Stacja stacjaPoczatkowa;

    private Stacja stacjaKoncowa;

    private List<Stacja> stacjePosrednie;

    public Linia(Stacja stacjaPoczatkowa, Stacja stacjaKoncowa) {
        this.stacjaPoczatkowa = stacjaPoczatkowa;
        this.stacjaKoncowa = stacjaKoncowa;
    }

    public void wyznaczanieTrasy() {
        
    }
}

package pl.edu.pja.s26635.pociag.lokomotywy;

import pl.edu.pja.s26635.infrastuktura.Stacja;

public class Lokomotywa {

    private static int idNum = 0;
    private String nazwa;
    private Stacja stacjaMacierzysta;
    private Stacja stacjaZrodlowa;
    private Stacja stacjaDocelowa;

    public Lokomotywa(String nazwa, Stacja stacjaMacierzysta, Stacja stacjaZrodlowa, Stacja stacjaDocelowa) {
        this.nazwa = nazwa;
        this.stacjaMacierzysta = stacjaMacierzysta;
        this.stacjaZrodlowa = stacjaZrodlowa;
        this.stacjaDocelowa = stacjaDocelowa;
        ++idNum;
    }

    public static int getIdNum() {
        return idNum;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Stacja getStacjaMacierzysta() {
        return stacjaMacierzysta;
    }

    public void setStacjaMacierzysta(Stacja stacjaMacierzysta) {
        this.stacjaMacierzysta = stacjaMacierzysta;
    }

    public Stacja getStacjaZrodlowa() {
        return stacjaZrodlowa;
    }

    public void setStacjaZrodlowa(Stacja stacjaZrodlowa) {
        this.stacjaZrodlowa = stacjaZrodlowa;
    }

    public Stacja getStacjaDocelowa() {
        return stacjaDocelowa;
    }

    public void setStacjaDocelowa(Stacja stacjaDocelowa) {
        this.stacjaDocelowa = stacjaDocelowa;
    }
}

package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.pociag.wagony.Wagon;

import java.util.Scanner;

public class TworzenieWagonuPodstawa {
    public static Wagon tworzenieWagonuPodstawa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nadawce wagonu:");
        String nadawca = scanner.nextLine();
        System.out.println("Podaj wagę netto wagonu:");
        int wagaNetto = scanner.nextInt();
        System.out.println("Podaj wagę brutto wagonu:");
        int wagaBrutto = scanner.nextInt();
        System.out.println("Podaj liczbę miejsc siedzących:");
        int liczbaMiejscSiedzacych = scanner.nextInt();
        System.out.println("Podaj liczbę wszystkich miejsc:");
        int liczbaWszystkichmiejsc = scanner.nextInt();
        return new Wagon(nadawca, wagaNetto, wagaBrutto, liczbaMiejscSiedzacych, liczbaWszystkichmiejsc) {
            @Override
            public String getNadawca() {
                return super.getNadawca();
            }

            @Override
            public int getWagaNetto() {
                return super.getWagaNetto();
            }

            @Override
            public int getWagaBrutto() {
                return super.getWagaBrutto();
            }

            @Override
            public int getLiczbaMiejscSiedzacych() {
                return super.getLiczbaMiejscSiedzacych();
            }

            @Override
            public int getLiczbaWszystkichMiejsc() {
                return super.getLiczbaWszystkichMiejsc();
            }
        };

    }
}

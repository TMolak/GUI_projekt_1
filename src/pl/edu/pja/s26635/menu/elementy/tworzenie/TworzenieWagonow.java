package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.Wagon;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPocz;

import java.util.Scanner;

import static pl.edu.pja.s26635.menu.elementy.tworzenie.TworzenieWagonuPodstawa.tworzenieWagonuPodstawa;

public class TworzenieWagonow {
    public static void tworzenieWagonow(){
        System.out.println("Wybierz rodzaj wagonu:");
        System.out.println("1. wagon pasażerski, wymagający podłączenia do sieci elektrycznej lokomotywy\n" +
                "2. wagon pocztowy, wymagający podłączenia do sieci elektrycznej lokomotywy\n" +
                "3. wagon bagażowo-pocztowy\n" +
                "4. wagon restauracyjny, wymagający podłączenia do sieci elektrycznej lokomotywy\n" +
                "5. wagon towarowy podstawowy\n" +
                "6. wagon towarowy ciężki\n" +
                "7. wagon chłodniczy, będący rodzajem wagonu towarowego podstawowego, wymagający podłączenia do sieci elektrycznej lokomotywy\n" +
                "8. wagon na materiały ciekłe, będący rodzajem wagonu towarowego podstawowego\n" +
                "9. wagon na materiały gazowe, będący rodzajem wagonu towarowego podstawowego\n" +
                "10. wagon na materiały wybuchowe, będący rodzajem wagonu towarowego ciężkiego\n" +
                "11. wagon na materiały toksyczne, będący rodzajem wagonu towarowego ciężkiego\n" +
                "12. wagon na ciekłe materiały toksyczne, który jest rodzajem wagonu towarowego ciężkiego,\n" +
                "oraz posiada cechy wagonu na materiały ciekłe\n" +
                "0. powrtót");
        Scanner scanner = new Scanner(System.in);
        ListaWagonow listaWagonow = ListaWagonow.getInstance();
        String decyzjaWagon = scanner.nextLine();
        switch (decyzjaWagon) {
            case "1":
                Wagon wagon = tworzenieWagonuPodstawa();
                System.out.println("Czy wagon ma toalete?");
                boolean toaleta = scanner.nextBoolean();
                System.out.println("Podaj ilosc miejsc na walizki:");
                int miejscaNaWalizki = scanner.nextInt();
                WagonPas wagonPas =
                        new WagonPas(wagon.getNadawca(), wagon.getWagaNetto(), wagon.getWagaBrutto(), wagon.getLiczbaMiejscSiedzacych(), wagon.getLiczbaWszystkichMiejsc(),
                                toaleta, miejscaNaWalizki);

                listaWagonow.dodajWagon(wagonPas);

                Witaj.start();
                break;
            case "2":
                Wagon wagon2 = tworzenieWagonuPodstawa();
                System.out.println("Podaj maksymalna wage przesylek");
                int wagaPrzesylek = scanner.nextInt();
                System.out.println("Czy wagon ma wifi?");
                boolean wifi = scanner.nextBoolean();

                WagonPocz wagonPocz =
                        new WagonPocz(wagon2.getNadawca(), wagon2.getWagaNetto(), wagon2.getWagaBrutto(), wagon2.getLiczbaMiejscSiedzacych(), wagon2.getLiczbaWszystkichMiejsc(),
                                wagaPrzesylek, wifi);

                listaWagonow.dodajWagon(wagonPocz);
                break;

            case "3":
               Wagon wagon3 = tworzenieWagonuPodstawa();
                System.out.println("Podaj maksymalna wagę wagę bagaży");
                int wagaBagazu = scanner.nextInt();

//                WagonBagPocz wagonBagPocz = new WagonBagPocz(wagon3.getNadawca(), wagon3.getWagaNetto(), wagon3.getWagaBrutto(), wagon3.getLiczbaMiejscSiedzacych(), wagon3.getLiczbaWszystkichMiejsc(),
//                        wagaBagazu);

                break;

            case "4":
                tworzenieWagonuPodstawa();
                break;

            case "5":
                tworzenieWagonuPodstawa();
                break;

            case "6":
                tworzenieWagonuPodstawa();
                break;

            case "7":
                tworzenieWagonuPodstawa();
                break;

            case "8":
                tworzenieWagonuPodstawa();
                break;

            case "9":
                tworzenieWagonuPodstawa();
                break;

            case "10":
                tworzenieWagonuPodstawa();
                break;

            case "11":
                tworzenieWagonuPodstawa();
                break;

            case "12":
                tworzenieWagonuPodstawa();
                break;

            case "0": Tworzenie.tworzenieElementow();
                break;
        }
    }
}

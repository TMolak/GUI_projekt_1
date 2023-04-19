package pl.edu.pja.s26635.menu.elementy.tworzenie;

import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.Wagon;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonBagPocz;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPocz;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonRes;
import pl.edu.pja.s26635.pociag.wagony.towarowe.*;

import java.util.Scanner;

import static pl.edu.pja.s26635.menu.elementy.tworzenie.TworzenieWagonuPodstawa.tworzenieWagonuPodstawa;

public class TworzenieWagonow {
    public static void tworzenieWagonow() {
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
                Scanner scanner1 = new Scanner(System.in);

                Wagon wagon = tworzenieWagonuPodstawa();
                System.out.println("Czy wagon ma toalete?");
                boolean toaleta = scanner1.nextBoolean();
                System.out.println("Podaj ilosc miejsc na walizki:");
                int miejscaNaWalizki = scanner1.nextInt();
                WagonPas wagonPas =
                        new WagonPas(wagon.getNadawca(), wagon.getWagaNetto(), wagon.getWagaBrutto(), wagon.getLiczbaMiejscSiedzacych(), wagon.getLiczbaWszystkichMiejsc(),
                                toaleta, miejscaNaWalizki);

                listaWagonow.dodajWagon(wagonPas);

                Witaj.start();
                break;
            case "2":
                Scanner scanner2 = new Scanner(System.in);

                Wagon wagon2 = tworzenieWagonuPodstawa();
                System.out.println("Podaj maksymalna wage przesylek");
                int wagaPrzesylek = scanner2.nextInt();
                System.out.println("Czy wagon ma wifi?");
                boolean wifi = scanner2.nextBoolean();

                WagonPocz wagonPocz =
                        new WagonPocz(wagon2.getNadawca(), wagon2.getWagaNetto(), wagon2.getWagaBrutto(), wagon2.getLiczbaMiejscSiedzacych(), wagon2.getLiczbaWszystkichMiejsc(),
                                wagaPrzesylek, wifi);

                listaWagonow.dodajWagon(wagonPocz);
                Witaj.start();

                break;

            case "3":
                Scanner scanner3 = new Scanner(System.in);

                Wagon wagon3 = tworzenieWagonuPodstawa();
                System.out.println("Podaj maksymalna wagę bagaży");
                int wagaBagazu = scanner3.nextInt();
                System.out.println("Podaj maksymalna wage przesylek");
                int wagaPrzesylek1 = scanner3.nextInt();
                System.out.println("Czy wagon ma wifi?");
                boolean wifi1 = scanner3.hasNextBoolean();
                WagonBagPocz wagonBagPocz = new WagonBagPocz(wagon3.getNadawca(), wagon3.getWagaNetto(), wagon3.getWagaBrutto(),
                        wagon3.getLiczbaMiejscSiedzacych(), wagon3.getLiczbaWszystkichMiejsc(),
                        wagaPrzesylek1, wifi1, wagaBagazu);

                listaWagonow.dodajWagon(wagonBagPocz);
                Witaj.start();

                break;

            case "4":
                Scanner scanner4 = new Scanner(System.in);

                Wagon wagon4 = tworzenieWagonuPodstawa();
                System.out.println("Czy wagon ma oferte sniadaniowa?");
                boolean ofertaSniadaniowa = scanner4.hasNextBoolean();
                System.out.println("Czy wagon ma oferte dla wegan lub wegetarian?");
                boolean ofertaWege = scanner4.hasNextBoolean();
                System.out.println("Ile stolow jest w wagonie?");
                int stoly = scanner4.nextInt();

                WagonRes wagonRes = new WagonRes(wagon4.getNadawca(), wagon4.getWagaNetto(), wagon4.getWagaBrutto(),
                        wagon4.getLiczbaMiejscSiedzacych(), wagon4.getLiczbaWszystkichMiejsc(), ofertaSniadaniowa, ofertaWege, stoly);
                listaWagonow.dodajWagon(wagonRes);
                Witaj.start();

                break;

            case "5":
                Scanner scanner5 = new Scanner(System.in);

                Wagon wagon5 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzaj = scanner5.nextLine();
                WagonTowPodst wagonTowPodst = new WagonTowPodst(wagon5.getNadawca(), wagon5.getWagaNetto(), wagon5.getWagaBrutto(),
                        wagon5.getLiczbaMiejscSiedzacych(), wagon5.getLiczbaWszystkichMiejsc(), rodzaj);
                listaWagonow.dodajWagon(wagonTowPodst);

                Witaj.start();

                break;

            case "6":
                Scanner scanner6 = new Scanner(System.in);

                Wagon wagon6 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzajCiezkiego = scanner6.nextLine();
                System.out.println("Podaj kolor wagonu:");
                String kolor = scanner6.nextLine();

                WagonTowCiez wagonTowCiez = new WagonTowCiez(wagon6.getNadawca(), wagon6.getWagaNetto(), wagon6.getWagaBrutto(),
                        wagon6.getLiczbaMiejscSiedzacych(), wagon6.getLiczbaWszystkichMiejsc(), rodzajCiezkiego, kolor);
                listaWagonow.dodajWagon(wagonTowCiez);

                Witaj.start();

                break;

            case "7":
                Scanner scanner7 = new Scanner(System.in);

                Wagon wagon7 = tworzenieWagonuPodstawa();
                System.out.println("Podaj kto sie reklamuje na wagonie");
                String reklama = scanner7.nextLine();
                System.out.println("Podaj minimalna temperature");
                int minTemp = scanner7.nextInt();
                WagonChlod wagonChlod = new WagonChlod(wagon7.getNadawca(), wagon7.getWagaNetto(), wagon7.getWagaBrutto(),
                        wagon7.getLiczbaMiejscSiedzacych(), wagon7.getLiczbaWszystkichMiejsc(), reklama, minTemp);
                listaWagonow.dodajWagon(wagonChlod);

                Witaj.start();

                break;

            case "8":
                Scanner scanner8 = new Scanner(System.in);

                Wagon wagon8 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzaj2 = scanner8.nextLine();
                System.out.println("Czy mozna przewozic napoje gazowane?");
                boolean napoje = scanner8.hasNextBoolean();
                System.out.println("Czy mozna przewozic paliwo lotnicze?");
                boolean paliwo = scanner8.hasNextBoolean();

                WagonCiekl wagonCiekl = new WagonCiekl(wagon8.getNadawca(), wagon8.getWagaNetto(), wagon8.getWagaBrutto(),
                        wagon8.getLiczbaMiejscSiedzacych(), wagon8.getLiczbaWszystkichMiejsc(), rodzaj2, napoje, paliwo);
                listaWagonow.dodajWagon(wagonCiekl);
                break;

            case "9":
                Scanner scanner9 = new Scanner(System.in);

                Wagon wagon9 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzaj3 = scanner9.nextLine();
                System.out.println("Ile pali na gazie");
                int spalanie = scanner9.nextInt();
                System.out.println("Rodzaj gazu");
                String rodzajGazu = scanner9.nextLine();
                WagonGaz wagonGaz = new WagonGaz(wagon9.getNadawca(), wagon9.getWagaNetto(), wagon9.getWagaBrutto(),
                        wagon9.getLiczbaMiejscSiedzacych(), wagon9.getLiczbaWszystkichMiejsc(), rodzaj3, spalanie, rodzajGazu);
                listaWagonow.dodajWagon(wagonGaz);
                Witaj.start();

                break;

            case "10":
                Scanner scanner10 = new Scanner(System.in);
                Wagon wagon10 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzajCiezkiego2 = scanner10.nextLine();
                System.out.println("Podaj kolor wagonu:");
                String kolor2 = scanner10.nextLine();
                System.out.println("Dla jakich sluzb ma jezdzic wagon?");
                String sluzby = scanner10.nextLine();
                System.out.println("Czy mozna wjechac nim do miasta?");
                boolean miasto = scanner10.hasNextBoolean();
                WagonWybuch wagonWybuch = new WagonWybuch(wagon10.getNadawca(), wagon10.getWagaNetto(), wagon10.getWagaBrutto(),
                        wagon10.getLiczbaMiejscSiedzacych(), wagon10.getLiczbaWszystkichMiejsc(), rodzajCiezkiego2, kolor2, sluzby, miasto);
                listaWagonow.dodajWagon(wagonWybuch);
                Witaj.start();

                break;

            case "11":
                Scanner scanner11 = new Scanner(System.in);
                Wagon wagon11 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzajCiezkiego3 = scanner11.nextLine();
                System.out.println("Podaj kolor wagonu:");
                String kolor3 = scanner11.nextLine();
                System.out.println("Czy mozna materialy radioaktywne");
                boolean radioAktywne = scanner11.hasNextBoolean();
                System.out.println("Czy swieci w nocy");
                boolean swiecenie = scanner11.hasNextBoolean();
                    WagonToxic wagonToxic = new WagonToxic(wagon11.getNadawca(), wagon11.getWagaNetto(), wagon11.getWagaBrutto(),
                        wagon11.getLiczbaMiejscSiedzacych(), wagon11.getLiczbaWszystkichMiejsc(), rodzajCiezkiego3, kolor3, radioAktywne, swiecenie);
                listaWagonow.dodajWagon(wagonToxic);

                Witaj.start();

                break;

            case "12":
                Scanner scanner12 = new Scanner(System.in);
                Wagon wagon12 = tworzenieWagonuPodstawa();
                System.out.println("Podaj rodzaj wagonu");
                String rodzajCiezkiego4 = scanner12.nextLine();
                System.out.println("Podaj kolor wagonu:");
                String kolor4 = scanner12.nextLine();
                System.out.println("Czy mozna przewozic napoje gazowane?");
                boolean napoje2 = scanner12.hasNextBoolean();
                System.out.println("Czy mozna przewozic paliwo lotnicze?");
                boolean paliwo2 = scanner12.hasNextBoolean();
                WagonCieklToxic wagonCieklToxic = new WagonCieklToxic(wagon12.getNadawca(), wagon12.getWagaNetto(), wagon12.getWagaBrutto(),
                        wagon12.getLiczbaMiejscSiedzacych(), wagon12.getLiczbaWszystkichMiejsc(),rodzajCiezkiego4, kolor4, napoje2, paliwo2);
                listaWagonow.dodajWagon(wagonCieklToxic);
                Witaj.start();

                break;

            case "0":
                Witaj.start();
                break;
        }
    }
}

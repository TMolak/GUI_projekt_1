package pl.edu.pja.s26635.menu.elementy;

import pl.edu.pja.s26635.menu.start.Witaj;
import pl.edu.pja.s26635.pociag.wagony.ListaWagonow;
import pl.edu.pja.s26635.pociag.wagony.cywilne.WagonPas;

import java.util.Scanner;

import static pl.edu.pja.s26635.menu.elementy.TworzenieWagonuPodstawa.tworzenieWagonuPodstawa;

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
        String decyzjaWagon = scanner.nextLine();
        switch (decyzjaWagon) {
            case "1":
                tworzenieWagonuPodstawa();
                System.out.println("Czy wagon ma toalete?");
                boolean toaleta = scanner.nextBoolean();
                System.out.println("Podaj ilosc miejsc na walizki:");
                int miejscaNaWalizki = scanner.nextInt();

                WagonPas wagonPas = new WagonPas(tworzenieWagonuPodstawa().nadawca, tworzenieWagonuPodstawa().wagaNetto, tworzenieWagonuPodstawa().wagaBrutto, tworzenieWagonuPodstawa().liczbaMiejscSiedzacych, tworzenieWagonuPodstawa().liczbaWszystkichMiejsc, toaleta, miejscaNaWalizki);
                ListaWagonow listaWagonow = ListaWagonow.getInstance();
                listaWagonow.dodajWagon(wagonPas);

                Witaj.start();
                break;
//            case "2":
//                tworzenieWagonuPodstawa();
//
//            case "3":
//                tworzenieWagonuPodstawa();
//
//            case "4":
//                tworzenieWagonuPodstawa();
//
//            case "5":
//                tworzenieWagonuPodstawa();
//
//            case "6":
//                tworzenieWagonuPodstawa();
//
//            case "7":
//                tworzenieWagonuPodstawa();
//
//            case "8":
//                tworzenieWagonuPodstawa();
//
//            case "9":
//                tworzenieWagonuPodstawa();
//
//            case "10":
//                tworzenieWagonuPodstawa();
//
//            case "11":
//                tworzenieWagonuPodstawa();
//
//            case "12":
//                tworzenieWagonuPodstawa();

            case "0": Tworzenie.tworzenieElementow();
        }
    }
}

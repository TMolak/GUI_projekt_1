package pl.edu.pja.s26635.menu.elementy;

import pl.edu.pja.s26635.Main;
import pl.edu.pja.s26635.infrastuktura.Stacja;
import pl.edu.pja.s26635.pociag.lokomotywy.ListaLokomotyw;
import pl.edu.pja.s26635.pociag.lokomotywy.Lokomotywa;

import java.util.Scanner;


public class Tworzenie {

    public static void tworzenieElementow() {
        System.out.println("Jaki element chcesz stworzyć?");
        System.out.println("1. Lokomotywa");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        if (decyzja.equals("1")) {
            ListaLokomotyw listaLokomotyw = ListaLokomotyw.getInstance();

            System.out.println("Podaj nazwę");
            String nazwa = scanner.nextLine();
            System.out.println("Podaj maksymalny uciąg");
            int maxUciag = scanner.nextInt();
            System.out.println("Podaj maksymalna liczbę wagnoów");
            int maxLiczWagonow = scanner.nextInt();
            System.out.println("Podaj maksymalna liczbę wagonów elektrycznych");
            int maxLiczWagonowEl = scanner.nextInt();
            System.out.println("Wybierz stację macierzysta (wpisujac numer na konsoli)");
            //wypisuje stacje z pliku tesktowego
            int i = 1;
            for (Stacja s : Stacja.listaStacji()) {
                System.out.println(i + ". " + s.getNazwaStacji());
                i++;
            }
            int stacjaMacierzysta = scanner.nextInt()-1;
            Stacja stacjaMac = Stacja.listaStacji().get(stacjaMacierzysta);
            System.out.println("Wybierz stację poczatkowa (wpisujac numer na konsoli)");
            int stacjaPoczatkowa = scanner.nextInt()-1;
            Stacja stacjaPocz = Stacja.listaStacji().get(stacjaPoczatkowa);
            System.out.println("Wybierz stację docelowa (wpisujac numer na konsoli)");
            int stacjaDocelowa = scanner.nextInt()-1;
            Stacja stacjaDoc = Stacja.listaStacji().get(stacjaDocelowa);

            Lokomotywa lokomotywa = new Lokomotywa(nazwa, stacjaMac, stacjaPocz, stacjaDoc, maxUciag, maxLiczWagonow, maxLiczWagonowEl);
            listaLokomotyw.dodajLokomotywe(lokomotywa);

            System.out.println(lokomotywa.toString());


        } else if (decyzja.equals("2")) {
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
                    "oraz posiada cechy wagonu na materiały ciekłe\n");
        }
    }
}

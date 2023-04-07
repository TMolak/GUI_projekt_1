package pl.edu.pja.s26635.menu.elementy;

import java.util.Scanner;

public class Tworzenie {

    public static void tworzenieElementow(){
        System.out.println("Jaki element chcesz stworzyć?");
        System.out.println("1. Lokomotywa");
        System.out.println("2. Wagon");
        System.out.println("3. Skład");
        System.out.println("4. Stacja kolejowa");
        System.out.println("5. Połączenie między stacjami");
        Scanner scanner = new Scanner(System.in);
        String decyzja = scanner.nextLine();
        if (decyzja.equals("2")){
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

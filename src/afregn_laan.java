import java.util.Scanner;
public class afregn_laan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("rente om året: ");
        double rente_aar = input.nextDouble();

        System.out.println("Antal år: ");
        int aar = input.nextInt();

        System.out.println("Hvor meget vil du låne? ");
        double laanemaengde = input.nextDouble();
/*
        double rente_maaned = rente_aar / 1200;

        System.out.println("Antal år: ");
        int aar = input.nextInt();

        System.out.println("Hvor meget vil du låne? ");
        double laanemaengde = input.nextDouble();

        double afdrag_maaned  = laanemaengde * rente_maaned / (1 - (1 / Math.pow(1 + rente_maaned, aar * 12)));
        double laan_betaling  = afdrag_maaned * aar * 12;

        System.out.println("Dit månedlige afdrag er lig: " + (int)(afdrag_maaned * 100) / 100);
        System.out.println("du skal i alt tilbage betale: " + (int)(laan_betaling * 100) / 100);
*/

    Rente(rente_aar, laanemaengde, aar);
    }

    public static void Rente(double rente_aar, double laanemaengde, int aar) {
        double rente_maaned = rente_aar / 1200;

        double afdrag_maaned  = laanemaengde * rente_maaned / (1 - (1 / Math.pow(1 + rente_maaned, aar * 12)));
        double laan_betaling  = afdrag_maaned * aar * 12;

        System.out.println("Dit månedlige afdrag er lig: " + (int)(afdrag_maaned * 100) / 100);
        System.out.println("du skal i alt tilbage betale: " + (int)(laan_betaling * 100) / 100);

    }
}

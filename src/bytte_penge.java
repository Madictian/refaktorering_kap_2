import java.util.Scanner;

public class bytte_penge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for meget skal betales");
        double maengde = input.nextDouble();
/*

        int resterende_maengde = (int)(maengde * 100);

        int hele_dollars = resterende_maengde / 100;
        resterende_maengde = resterende_maengde % 100;

        int antal_quarters = resterende_maengde / 25;
        resterende_maengde = resterende_maengde % 25;

        int antal_dimes = resterende_maengde / 10;
        resterende_maengde = resterende_maengde % 10;

        int antal_nickels = resterende_maengde / 5;
        resterende_maengde = resterende_maengde % 5;

        int antal_pennies = resterende_maengde;

        System.out.println("Du har " + maengde );
        System.out.println("" + hele_dollars);
        System.out.println("" + antal_quarters);
        System.out.println("" + antal_dimes);
        System.out.println("" + antal_nickels);
        System.out.println("" + antal_pennies);
*/
    Penge(maengde);
    }

    public static void Penge(double maengde) {
        int resterende_maengde = (int)(maengde * 100);

        int hele_dollars = resterende_maengde / 100;
        resterende_maengde = resterende_maengde % 100;

        int antal_quarters = resterende_maengde / 25;
        resterende_maengde = resterende_maengde % 25;

        int antal_dimes = resterende_maengde / 10;
        resterende_maengde = resterende_maengde % 10;

        int antal_nickels = resterende_maengde / 5;
        resterende_maengde = resterende_maengde % 5;

        int antal_pennies = resterende_maengde;

        System.out.println("Du har " + maengde );
        System.out.println("" + hele_dollars);
        System.out.println("" + antal_quarters);
        System.out.println("" + antal_dimes);
        System.out.println("" + antal_nickels);
        System.out.println("" + antal_pennies);
    }
}

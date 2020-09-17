import java.util.Scanner;
public class vis_tid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("indsæt et antal sekunder: ");
        int sekunder = input.nextInt();

        int minutter = sekunder / 60;
        int overskydende_minutter = sekunder % 60;
        System.out.println(sekunder + " antal sekunder er lig " + minutter + " minutter og " + overskydende_minutter + " sekunder");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double centimeter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in måtten");
        centimeter = sc.nextDouble();

        // hitta olika mått

        double famn = ( centimeter ) / 0.00562;
        double aln = (centimeter) / 0.0168;
        double tum = (centimeter) / 0.404;
        double fot = (centimeter) / 0.0337;

        //printa ut alla mått i cm

        System.out.println ( centimeter + " famn är " + famn + " cm");
        System.out.println ( centimeter + " aln är " + aln + " cm");
        System.out.println ( centimeter + " tum är " + tum + " cm");
        System.out.println ( centimeter + " fot är " + fot + " cm");

    }
}
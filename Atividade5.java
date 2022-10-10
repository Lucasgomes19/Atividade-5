import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digitem a medida em metros:");
        double m = sc.nextDouble();

        double cm = m * 100;
        System.out.println(m + " metros equivale à " + cm + " centímetros.");
        sc.close();

    }
}

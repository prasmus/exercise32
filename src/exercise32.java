/**
 * Created by Praktika on 9.11.2016.
 */

import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {

        double Cel, Fah;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Celsius value: ");
        Cel = in.nextDouble();

        Fah = Cel * 9 / 5 + 32;
        System.out.printf("%.1f C = %.1f F\n", Cel, Fah);

    }
}

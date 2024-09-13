import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;

        for (int i = 0; i < 6; i++) {
            double entry = sc.nextDouble();

            if (entry > 0) {
                positiveCount++;
            }
        }

        System.out.println(positiveCount + " valores positivos");

        sc.close();
    }
}

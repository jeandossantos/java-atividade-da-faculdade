import java.util.Scanner;

public class ParesEntre5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;

        for (int i = 0; i < 5; i++) {
            double entry = sc.nextDouble();

            if (entry % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println(evenCount + " valores pares");

        sc.close();
    }
}

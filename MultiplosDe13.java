import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();
        if (y < x) {
            int temp = x;
            x = y;
            y = temp;
        }

        int sumNonMultiples = 0;

        for (int i = x; i <= y; i++) {

            if (i % 13 != 0) {

                sumNonMultiples += i;
            }
        }

        System.out.println(sumNonMultiples);
    }
}
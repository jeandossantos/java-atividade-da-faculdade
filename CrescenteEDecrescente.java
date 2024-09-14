import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] numbs = sc.nextLine().split(" ");
            int x, y;

            x = Integer.parseInt(numbs[0]);
            y = Integer.parseInt(numbs[1]);

            if (x == y) {
                sc.close();
                System.exit(0);
            }

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}

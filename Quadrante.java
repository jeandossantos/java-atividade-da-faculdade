import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Quadrante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> rs = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] xy = sc.nextLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            if (x == 0 || y == 0) {
                sc.close();
                System.exit(0);
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }

            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }

            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }

        }

    }
}

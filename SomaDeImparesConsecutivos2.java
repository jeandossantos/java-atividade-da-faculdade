import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDeImparesConsecutivos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArgs = sc.nextInt();

        sc.nextLine();

        List<Integer> numbs = new ArrayList<>();

        for (int i = 0; i < numArgs; i++) {
            String[] xy = sc.nextLine().trim().split(" ");

            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            if (y < x) {
                int temp = x;
                x = y;
                y = temp;
            }

            int sum = 0;

            while (x < y) {
                ++x;

                if (x % 2 != 0 && x != y) {
                    sum += x;
                }
            }

            numbs.add(sum);
        }

        for (Integer n : numbs) {
            System.out.println(n);
        }

        sc.close();
    }
}

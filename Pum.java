import java.util.*;

public class Pum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        sc.close();

        int i = 1;

        for (int count = 0; count < numOfLines; count++) {
            int j = i + 3;

            int[] pums = { i, (i + 1), (i + 2) };
            System.out.println(pums[0] + " " + pums[1] + " " + pums[2] + " PUM");

            i += 4;
        }

    }
}

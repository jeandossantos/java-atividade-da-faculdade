import java.util.Scanner;

public class DividindoXporY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArgs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numArgs; i++) {
            String[] xy = sc.nextLine().split(" ");
            double x = Double.parseDouble(xy[0]);
            double y = Double.parseDouble(xy[1]);

            double rs = x / y;

            if (Double.isNaN(rs) || Double.isInfinite(rs)) {
                System.out.println("divisao impossivel");
            }

            System.out.println(rs);

        }

        sc.close();
    }
}

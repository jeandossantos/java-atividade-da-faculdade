import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAgs = sc.nextInt();

        sc.nextLine();
        List<Double> medias = new ArrayList<>();

        for (int i = 0; i < qtdAgs; i++) {
            String[] data = sc.nextLine().trim().split(" ");

            double[] entry = { toDouble(data[0]), toDouble(data[1]), toDouble(data[2]) };

            medias.add(((entry[0] * 2) + (entry[1] * 3) + (entry[2] * 5)) / 10);
        }

        for (double m : medias) {
            System.out.println(String.format("%.1f", m));
        }

        sc.close();
    }

    public static double toDouble(String d) {

        return Double.parseDouble(d);
    }
}

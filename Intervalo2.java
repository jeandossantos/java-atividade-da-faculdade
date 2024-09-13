import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAgs = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < qtdAgs; i++) {
            int entry = sc.nextInt();

            if (entry >= 10 && entry <= 20) {
                ++in;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}

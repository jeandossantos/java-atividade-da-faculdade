import java.util.*;

public class QuadradoEAoCubo {
    public static void main(String[] args) {
        // escreva ao quadrado e ao cubo

        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        sc.close();

        for (int i = 1; i <= numOfLines; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }
    }
}

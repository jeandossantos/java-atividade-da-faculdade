import java.util.Scanner;

public class SomandoInteirosConsecutivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os valores de A e N
        int A = sc.nextInt();
        int N = sc.nextInt();

        // Enquanto N for negativo ou zero, peça um novo valor para N
        while (N <= 0) {
            N = sc.nextInt();
        }

        int soma = 0;

        // Faz a soma dos valores de A até A + (N-1)
        for (int i = 0; i < N; i++) {
            soma += A + i;
        }

        // Imprime o valor final da soma
        System.out.println(soma);

        sc.close();
    }
}

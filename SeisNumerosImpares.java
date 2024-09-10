// Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

// Entrada
// A entrada será um valor inteiro positivo.

// Saída
// A saída será uma sequência de seis números ímpares.

import java.io.IOException;
import java.util.Scanner;
 

public class SeisNumerosImpares {
 
    public static void main(String[] args) throws IOException {
  
  
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        int countOdd = 0;
        while (countOdd < 6) {
            
            if((n % 2) != 0) {
                System.out.println(n);
                countOdd++;
            }

            n++;
        }

        sc.close();
    }
 
}
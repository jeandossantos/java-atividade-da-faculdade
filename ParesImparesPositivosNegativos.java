// 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
                
        int count = 0;
        while(count < 5) {
            int num = sc.nextInt();

            if(Math.abs(num) % 2 == 0) {
                pares.add(num);
            }

            if(Math.abs(num) % 2 != 0) {
                impares.add(num);
            }

            if(num > 0){
                positivos.add(num);
            }

            if(num < 0) {
                negativos.add(num);
            }      
            
            count++;
        }

        System.out.println(pares.size() + " valor(es) par(es)");
        System.out.println(impares.size() + " valor(es) impar(es)");
        System.out.println(positivos.size() + " valor(es) positivo(s)");
        System.out.println(negativos.size() + " valor(es) negativo(s)");

        sc.close();

    }
}
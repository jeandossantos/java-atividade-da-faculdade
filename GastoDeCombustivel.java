import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;
 
public class GastoDeCombustivel {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int spentHours = sc.nextInt();
        int velocity = sc.nextInt();
        
        double spentGasoline = (spentHours * velocity) / 12.0;
        
        System.out.println(String.format("%.3f", spentGasoline));
        
        sc.close();
    }
 
}
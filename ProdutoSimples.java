import java.io.IOException;
 
import java.util.Scanner;

public class ProdutoSimples {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int PROD = a * b;
        
        System.out.println("PROD = " + PROD);
        
        sc.close();
    } 
}
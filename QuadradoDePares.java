import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        
        while(count <= n) {
            count++;
            if(count % 2 == 0) {
                int intResult = (int) Math.pow(count, 2);
                System.out.println(count + "^" + 2 + " = " + intResult);
            }
        }


        sc.close();
    }
}

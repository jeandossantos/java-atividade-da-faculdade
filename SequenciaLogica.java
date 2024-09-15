import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        sc.close();

        for (int i = 1; i <= numOfLines; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + ((i * i) + 1) + " " + ((i * i * i) + 1));
        }
    }
}
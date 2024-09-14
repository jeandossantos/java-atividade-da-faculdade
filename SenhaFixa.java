import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int pwd = sc.nextInt();

            if (pwd == 2002) {
                sc.close();
                System.out.println("Acesso Permitido");
                System.exit(0);
            } else {
                System.out.println("Senha Invalida");
            }

        }
    }
}

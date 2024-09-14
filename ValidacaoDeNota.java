import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double firstScoreValid = null, secondScoreValid = null;

        while (sc.hasNextLine()) {
            double score = sc.nextDouble();

            if (score >= 0 && score <= 10) {
                if (firstScoreValid == null) {
                    firstScoreValid = score;
                } else {
                    secondScoreValid = score;
                }

                if (firstScoreValid != null && secondScoreValid != null) {
                    System.out.println(String.format("media = %.2f", (firstScoreValid + secondScoreValid) / 2));
                    sc.close();
                    System.exit(0);
                }
            } else {
                System.out.println("nota invalida");
            }
        }

    }
}

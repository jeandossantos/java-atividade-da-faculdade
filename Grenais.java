import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int newGrenal = 1;
        int interVictories = 0;
        int gremioVictories = 0;
        int draws = 0;
        int grenais = 0;

        while (newGrenal == 1) {
            String[] input = sc.nextLine().split(" ");
            int interGols = Integer.parseInt(input[0]);
            int gremioGols = Integer.parseInt(input[1]);

            if (interGols > gremioGols) {
                interVictories++;
            } else if (gremioGols > interGols) {
                gremioVictories++;
            } else {
                draws++;
            }

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");

            newGrenal = sc.nextInt();
            sc.nextLine();
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interVictories);
        System.out.println("Gremio:" + gremioVictories);
        System.out.println("Empates:" + draws);

        if (interVictories == gremioVictories) {
            System.out.println("Nao houve vencedor");
        } else if (interVictories > gremioVictories) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }

        sc.close();
    }
}

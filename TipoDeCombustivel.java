import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fuelCounts = new int[3]; // array to store counts for each fuel type

        while (true) {
            int choice = scanner.nextInt();

            if (choice == 4) {
                break; // exit the loop if user inputs 4 (Fim)
            }

            if (choice < 1 || choice > 3) {
                continue; // prompt user to enter a new code
            }

            fuelCounts[choice - 1]++; // increment counter for corresponding fuel type
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + fuelCounts[0]);
        System.out.println("Gasolina: " + fuelCounts[1]);
        System.out.println("Diesel: " + fuelCounts[2]);
    }
}
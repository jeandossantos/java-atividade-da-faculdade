import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lanche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<LancheClass> lanches = new ArrayList<>();
        lanches.add(new LancheClass(1, 4.0));
        lanches.add(new LancheClass(2, 4.50));
        lanches.add(new LancheClass(3, 5.0));
        lanches.add(new LancheClass(4, 2));
        lanches.add(new LancheClass(5, 1.50));

        String[] dados = sc.nextLine().split(" ");
        int cod = Integer.parseInt(dados[0]);
        int qdt = Integer.parseInt(dados[1]);

        LancheClass lanche = buscarLanchePorCod(lanches, cod);

        System.out.println("Total: R$ " + String.format("%.2f", lanche.getPrice() * qdt));

        sc.close();
    }

    public static LancheClass buscarLanchePorCod(List<LancheClass> lanches, int cod) {
        for (LancheClass lanche : lanches) {
            if (lanche.getCod() == cod) {
                return lanche;
            }
        }
        return null; // Retorna null se o lanche não for encontrado
    }
}

class LancheClass {
    private int cod;
    private double price;

    public LancheClass(int cod, double price) {
        this.cod = cod;
        this.price = price;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

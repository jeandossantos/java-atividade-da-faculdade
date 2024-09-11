// Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

// Distancia =

// Entrada
// O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

// Saída
// Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.


import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] eixosX = sc.nextLine().split(" ");
        String[] eixosY = sc.nextLine().split(" ");

        double[] eixos = {
            Double.parseDouble(eixosX[0]),
            Double.parseDouble(eixosY[0]),
            Double.parseDouble(eixosX[1]),
            Double.parseDouble(eixosY[1])
        };

        double distancia = Math.sqrt(Math.pow( (eixos[0] - eixos[1]), 2 ) + (Math.pow( (eixos[2] - eixos[3]), 2) ));

        System.out.println(String.format("%.4f", distancia));

        sc.close();
    }
}

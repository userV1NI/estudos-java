package teste;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int [] valores = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < valores.length; i++) {
            valores[i] = aleatorio.nextInt(10);
            System.out.println(valores[i]);
        }
        System.out.println("Agora usando o For Each.");

        for (int valor : valores) {
            valor = aleatorio.nextInt(10);
            System.out.println(valor);
        }

        // Exemplo 02:
        System.out.println("Segundo exemplo.");
        double[][] notas = new double[2][4];
        notas[0][0] = 10;
        notas[0][1] = 10;
        notas[0][2] = 7;
        notas[0][3] = 1;

        notas[1][0] = 3;
        notas[1][1] = 4;
        notas[1][2] = 10;
        notas[1][3] = 10;

        for (double [] nota : notas) {
            for (double n : nota) {
                System.out.println(n + " ");
            }
            System.out.println();
        }
    }
}

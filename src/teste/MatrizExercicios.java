package teste;

import java.util.Random;

public class MatrizExercicios {
    public static void main(String[] args) {
        int[][] randomnumbers = new int[4][4];
        Random aleatorio = new Random();
        for (int i = 0; i < randomnumbers.length; i++) {
            for (int j = 0; j <= randomnumbers[i].length; j++) {
                randomnumbers[i][j] = aleatorio.nextInt(100);
            }

        }
        int maior = 0, linha = 0, coluna = 0;
        for (int i = 0; i < randomnumbers.length; i++) {
            for (int j = 0; j <= randomnumbers[i].length; j++) {
                if (randomnumbers[i][j] > maior) {
                    maior = randomnumbers[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}

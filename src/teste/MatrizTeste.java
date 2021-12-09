package teste;

public class MatrizTeste {
    public static void main(String[] args) {
        double notas[][] = new double[2][4];
        notas[0][0] = 10;
        notas[0][1] = 10;
        notas[0][2] = 7;
        notas[0][3] = 1;

        notas[1][0] = 3;
        notas[1][1] = 4;
        notas[1][2] = 10;
        notas[1][3] = 10;

        System.out.println("Calculando a média: ");
        double soma;

        for (int i = 0; i < notas.length; i++) {
            soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
        }

    }
}

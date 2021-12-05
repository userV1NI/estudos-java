package teste;

public class ArrayTest {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        temperaturas [0] = 31.3;
        temperaturas [1] = 33.3;
        temperaturas [2] = 34;
        temperaturas [3] = 31;
        temperaturas [4] = 33.1;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }
    }
}

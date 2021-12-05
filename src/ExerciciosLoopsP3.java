
public class ExerciciosLoopsP3 {
    public static void main(String[] args) {
        int a = 80000;
        int b = 200000;
        int cont = 0;

        while (a < b) {
            a += (a/100) * 3;
            b += (b/100) *  1.5;
            cont++;

        }
        System.out.println("População A: " + a);
        System.out.println("População B: " + b);
        System.out.println("Quantidade de anos: " + cont);
    }
}

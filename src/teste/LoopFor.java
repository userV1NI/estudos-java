package teste;

public class LoopFor {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        for (int i=4; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("-----------------");
        for (int i=0, j=10; i<j; i++, j--) {
            System.out.println("i tem valor: " + i + " e J tem valor: " + j);
        }
        System.out.println("-----------------");
        int count = 0;
        for (; count < 10; ) {
            count += 2;
            System.out.println(count);
        }
        System.out.println("-----------------");
        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println(cont);
        }
        System.out.println("-----------------");
        int soma = 0;
        for (int i=1; i < 5; soma += i++);
        System.out.println(soma);
    }
}

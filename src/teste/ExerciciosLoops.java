package teste;

import java.util.Scanner;

public class ExerciciosLoops {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean notaValida = false;
      do {
          System.out.println("Informe uma nota entre 0 e 10: ");
           double nota = leitor.nextDouble();
           if (nota >= 0 && nota <= 10) {
               notaValida = true;
               System.out.println("Nota válida.");
           }
           else {
               System.out.println("Nota inválida, tente novamente.");
           }
      } while (!notaValida);
        System.out.println("FIM");
    }
}

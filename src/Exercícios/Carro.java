package Exercícios;

import java.util.Scanner;



public class Carro {
    public static void main(String[] args) {

       CompCarro carro = new CompCarro();
       Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a marca do carro: ");
        carro.marca = leitor.next();

        System.out.println("O modelo do carro: ");
        carro.modelo = leitor.next();

        System.out.println("O número de passageiros: ");
        carro.numPassageiros = leitor.nextInt();

        System.out.println("A capacidade de combustível: ");
        carro.capCombustivel = leitor.nextDouble();

        System.out.println("O consumo de combustível: ");
        carro.consumoCombustivel = leitor.nextDouble();

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.numPassageiros);
        System.out.println(carro.capCombustivel);
        System.out.println(carro.consumoCombustivel);

    }
}

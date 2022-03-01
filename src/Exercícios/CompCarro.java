package Exercícios;

/* Crie uma classe carro com os atributos marca, modelo, número de passageiros, capacidade de combustível
 e consumo de combustível, em seguida peça para o usuário informá-los*/

public class CompCarro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    /* Crie métodos para calcular a autonomia do carro(Capacidade co combustível vezes o consumo)
     e a quantidade de combustível (Consumo de combustível dividido pelos quilômetros
     */

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel );
    }

    public double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }


    public double calcularCombustivel (double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}

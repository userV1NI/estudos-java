package Exercícios;


public class SetEGetCompCarro {
    public static void main(String[] args) {

        SetEGetCarro carro = new SetEGetCarro();

        carro.setMarca("Fiat");
        System.out.println(carro.getMarca());

        carro.setModelo("Uno");
        System.out.println(carro.getModelo());

        carro.setNumPassageiros(2);
        System.out.println(carro.getNumPassageiros());

        carro.setCapCombustivel(30);
        System.out.println(carro.getCapCombustivel());

        carro.setConsumoCombustivel(15);
        System.out.println(carro.getConsumoCombustivel());



    }
}

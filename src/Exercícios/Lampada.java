package Exercícios;

import java.util.Objects;
import java.util.Scanner;

public class Lampada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CompLampada lampada = new CompLampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarelo";
        lampada.tipoLuz = "Amarelo";
        lampada.tipos = new String[5];

        lampada.tipos [0] = "Abajur";
        lampada.tipos [1] = "Lampeão";
        lampada.tipos [2] = "Abajur";
        lampada.tipos [3] = "Abajur";
        lampada.tipos [4] = "Abajur";

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.garantiaMeses);
        System.out.println(lampada.potencia);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipoLuz);

        System.out.println("Deseja ligar ou desligar a Lâmpada[Informe S ou N]?");
        lampada.ligarOuDesligar = leitor.next();

        if (lampada.ligarOuDesligar == "S") {
           lampada.ligarLampada();
        }

        else if (lampada.ligarOuDesligar == "N") {
            lampada.desligarLampada();
        }


    }
}

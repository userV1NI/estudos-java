package Programa;

public class Programa {
    public static void main(String[] args) {
        Caneca canecaJava = new Caneca();
        canecaJava.cor = "Preta";
        canecaJava.volume = 450;
        canecaJava.diametro = 3.0;
        canecaJava.estadoCaneca();

        System.out.println(canecaJava.cor);
        System.out.println(canecaJava.volume);
        System.out.println(canecaJava.diametro);
    }
}

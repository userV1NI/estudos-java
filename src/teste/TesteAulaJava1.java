package teste;

import java.util.Locale;

public class TesteAulaJava1 {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println(local.getDisplayLanguage());
        System.out.println(local.getLanguage());
    }
}

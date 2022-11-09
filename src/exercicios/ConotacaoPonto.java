package exercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class ConotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "bom dia  X";
        s = s.replace("X","Senhora");// replace troca X por Senhora
        s= s.toUpperCase(); //deixa o texto em maiusculo
        s.concat("!!!");//concatena o texto


        System.out.println(s);
        System.out.println(a);
    }

}

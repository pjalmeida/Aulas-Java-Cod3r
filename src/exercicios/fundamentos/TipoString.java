package exercicios.fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("OLAAAAAAAAAAA PESSOAL".charAt(15));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s+"???");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.startsWith("Boa Tarde"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa"));

        var nome = "Paulo";
        var sobrenome = "almeida";
        var idade = 33;
        double salario  = 15000;

        System.out.println("nome: "+nome+"Sobrenome: "+sobrenome+"idade: "+idade+"Salario: "+salario);
        System.out.printf("%s %s tem %d e ganha R$ %.2f.", nome,sobrenome,idade,salario);
        String  frase = String.format("%s %s tem %d e ganha R$ %.2f.", nome,sobrenome,idade,salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,8));
    }
}

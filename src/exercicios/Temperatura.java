package exercicios;

public class Temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		double AJUSTE = 32;
		
		double fahrenheit =	86;
		
		double celcius =(fahrenheit-AJUSTE)*FATOR;
		System.out.println("O resultado é "+celcius+"°C");
		
		
	    fahrenheit =150;
	    celcius =(fahrenheit-AJUSTE)*FATOR;
		System.out.println("O resultado é "+celcius+"°C");

	}

}

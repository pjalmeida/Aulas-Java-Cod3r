package exercicios;

public class TiposPrimitivos {
		public static void main(String[] args) {
			
			
			//tipos numericos inteiros
			byte anosEeEmpresa= 23;
			short numeriDeVoos = 542;
			int id =  56789;
			long pontosAcomulados = 3_234_845_223L; //L ou l pra definir literal long
			
			// tipos numericos reais
			float salario =  11_445_44F;// F ou f para definir valor literal float
			double vendasAcomuladas = 2_991_797_103.91;
			
			//tipo boleano
			boolean estaDeFerias = true;// recebe true ou falsecomo valores
			
			//tipo caractere
			char status = 'A'; // rcebe um charactere ou um unicode
			
			//dias de empresa
			
			System.out.println(anosEeEmpresa*365);
			
			// numeros de viagens
			System.out.println(numeriDeVoos/2);
			
			//pontos por real
			System.out.println(pontosAcomulados/vendasAcomuladas);
			
			System.out.println("ID "+id +" ganha: "+salario);
			System.out.println("ferias? "+estaDeFerias);
			
			System.out.println("Status: "+status);
			
		}

}

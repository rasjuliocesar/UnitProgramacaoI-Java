package questao.seis;

public class ComparaNumero {

	public static void main(String[] args) {
		
		/*
		 * Lista de Exercícios - Questão 6
		 * 
		 * Crie uma classe java ComparaNumero que contenha um método que receba
		 * dois números e indique se são iguais ou se são diferentes. Mostre o
		 * maior e o menor (nesta sequência).
		 * 
		 */
		
		int numero1 = 9;
		int numero2 = 91;
		
		System.out.println(numero1 + " é Igual a " + numero2 + ": " + comparando(numero1, numero2));
		System.out.println(maior(numero1, numero2));
	}
	
	public static boolean comparando(int a, int b) {
		if(a == b) {
			return true;
		}
		return false;
	}
	
	public static String maior(int a, int b) {
		if(a == b) {
			return a + " é Igual a " + b + " = Números Iguais";
		}else {
			if(a > b) {
				return "Número Maior: " + a + "\nNúmero Menor: " + b;
			}else {
				return "Número Maior: " + b + "\nNúmero Menor: " + a;
			}
		}
	}
}

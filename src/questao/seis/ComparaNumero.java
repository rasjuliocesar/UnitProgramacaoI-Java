package questao.seis;

public class ComparaNumero {

	public static void main(String[] args) {
		
		/*
		 * Lista de Exerc�cios - Quest�o 6
		 * 
		 * Crie uma classe java ComparaNumero que contenha um m�todo que receba
		 * dois n�meros e indique se s�o iguais ou se s�o diferentes. Mostre o
		 * maior e o menor (nesta sequ�ncia).
		 * 
		 */
		
		int numero1 = 9;
		int numero2 = 91;
		
		System.out.println(numero1 + " � Igual a " + numero2 + ": " + comparando(numero1, numero2));
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
			return a + " � Igual a " + b + " = N�meros Iguais";
		}else {
			if(a > b) {
				return "N�mero Maior: " + a + "\nN�mero Menor: " + b;
			}else {
				return "N�mero Maior: " + b + "\nN�mero Menor: " + a;
			}
		}
	}
}

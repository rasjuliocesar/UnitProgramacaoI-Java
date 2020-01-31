package questao.cinco;

public class TrocaNumero {

	
	public static void main(String[] args) {
	
		/*
		 * Lista de Exercícios - Questão 5
		 * 
		 * Crie uma classe java TrocaNumero que contenha um método que receba dois números
		 * NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos forem NumA
		 * = 5 e NumB = 9, por exemplo, devem ser impressos na ordem NumA = 9 e NumB = 5.
		 * 
		 */
		
		int numA = 51;
		int numB = 90;
		
		System.out.println(troca(numA, numB));
	
	}
	
	public static String troca(int num1, int num2) {
		return "numA " + num2 + " e numB " + num1;
	}
	
}

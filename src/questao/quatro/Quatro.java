package questao.quatro;

public class Quatro {

	public static void main(String[] args) {


		/*
		 * Lista de Exerc�cios - Quest�o 4
		 * 
		 * Escreva um programa que imprima na tela a soma dos n�meros �mpares entre 0 e 30 e
		 * a multiplica��o dos n�meros pares entre 0 e 30.
		 * 
		 */
		
		int numero = 0;
		int somaImpar = 0;
		int multiplicacaoPar = 0; //Considerando que 0 � Par
		
		while(numero <= 30) {
			if(numero % 2 == 0) {
				multiplicacaoPar *= numero;
			}else {
				somaImpar += numero;
			}
			numero++;
		}
		
		System.out.print("A Soma dos valores �mpares entre 0 e 30: " + somaImpar);
		System.out.print("\nA Multiplica��o dos valores pares entre 0 e 30: " + multiplicacaoPar);
	}

}

package questao.tres;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {


		/*
		 * Lista de Exerc�cios - Quest�o 3
		 * 
		 * Crie uma Classe java NumeroDecrescente que contenha um m�todo que receba um
		 * numero inteiro e imprima, em ordem decrescente, o valor do n�mero at� 0.
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("------- CONTAGEM DECRESCENTE -------");
		System.out.print("\n Informe um N�mero inteiro: ");
		int numero = teclado.nextInt();
		
		while(numero >= 0) {
			System.out.println(numero);
			numero--;
		}
		
		
		teclado.close();

	}

}

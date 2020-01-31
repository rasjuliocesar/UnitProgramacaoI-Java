package questao.tres;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {


		/*
		 * Lista de Exercícios - Questão 3
		 * 
		 * Crie uma Classe java NumeroDecrescente que contenha um método que receba um
		 * numero inteiro e imprima, em ordem decrescente, o valor do número até 0.
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("------- CONTAGEM DECRESCENTE -------");
		System.out.print("\n Informe um Número inteiro: ");
		int numero = teclado.nextInt();
		
		while(numero >= 0) {
			System.out.println(numero);
			numero--;
		}
		
		
		teclado.close();

	}

}

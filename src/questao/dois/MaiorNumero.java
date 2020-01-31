package questao.dois;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {


		/*
		 * Lista de Exerc�cios - Quest�o 2
		 * 
		 * Crie uma classe java MaiorNumero que contenha um m�todo que receba dois n�meros
		 * inteiros e imprima o maior entre eles.
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o Maior N�mero (Inteiro) ???");
		System.out.print("\nInforme o 1� Valor: ");
		int num1 = teclado.nextInt();
		System.out.print("\nInforme o 2� Valor: ");
		int num2 = teclado.nextInt();
		
		System.out.println(maior(num1, num2));
		
		teclado.close();

	}
	
	public static String maior(int numero1, int numero2) {
		String resultado;
		if(numero1 > numero2) {
			resultado = "\nO valor: " + numero1 + " � Maior que o valor: " + numero2 + ".";
		}else if(numero2 > numero1){
			resultado = "\nO valor: " + numero2 + " � Maior que o valor: " + numero1 + ".";
		}else {
			resultado = "\nO Valor: " + numero1 + " � Igual ao valor: " + numero2 + ".";
		}
		return resultado;
	}


}

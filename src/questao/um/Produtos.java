package questao.um;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		
		/*
		 * Lista de Exerc�cios - Quest�o 1
		 * 
		 * Para cada produto informado (nome, pre�o e quantidade), escreva o nome do produto comprado
		 * e o valor totaql a ser pago, considerando que s�o oferecidos descontos pelo n�mero de unidades
		 * compradas, segundo a tabela abaixo:
		 * 
		 * a) At� 10 unidades: valor total
		 * b) de 11  a 20 unidades: 10% de desconto
		 * c) de 21  a 50 unidades: 20% de desconto
		 * d) Acima de 50 unidades: 25% de desconto
		 * 
		 */
		
		Scanner teclado  = new Scanner(System.in);
		
		String nomeProduto;
		double precoProduto;
		int quantidadeProduto;
		double valorFinalProduto = 0;
		
		System.out.println("-=-=-=-=-= VENDA DE PRODUTOS -=-=-=-=-=");
		System.out.print("\nInforme o Nome do Produto: ");
		nomeProduto = teclado.nextLine();
		System.out.print("\nInforme o Pre�o do Produto: ");
		precoProduto = teclado.nextDouble();
		System.out.print("\nInform a Quantidade do Produto: ");
		quantidadeProduto = teclado.nextInt();
		
		if(quantidadeProduto <= 10) {
			valorFinalProduto = precoProduto * quantidadeProduto;
		}else if(quantidadeProduto > 10 && quantidadeProduto < 21) {
			valorFinalProduto = (precoProduto * quantidadeProduto) * 0.90;
		}else if(quantidadeProduto > 21 && quantidadeProduto < 51) {
			valorFinalProduto = (precoProduto * quantidadeProduto) * 0.80;
		}
		else {
			valorFinalProduto = (precoProduto * quantidadeProduto) * 0.75;
		}
		
		System.out.println("\n-=-=-=-=-= CUPOM FISCAL -=-=-=-=-=");
		System.out.print("\nProduto: " + nomeProduto);
		System.out.print("\nValor Unit�rio: R$ " + precoProduto);
		System.out.print("\nQuantidade: " + quantidadeProduto);
		System.out.print("\n\nValor Total: R$ " + (precoProduto * quantidadeProduto));
		System.out.print("\n\nValor Final com Desconto: " + valorFinalProduto);
		
		
		teclado.close();

	}

}

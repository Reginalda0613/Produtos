package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Program {

	public static void main(String[] args) {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Produto produto = new Produto();
			System.out.println("Digite o produto: ");
			System.out.print("Nome: ");
			produto.nome = sc.nextLine();
			System.out.print("Preco: ");
			produto.preco = sc.nextDouble();
			System.out.print("Quantidade em estoque: ");
			produto.quantidade = sc.nextInt();
			
			System.out.println();
			System.out.println("Produto: " + produto);
			
			System.out.println();
			System.out.print("Digite o numero de produtos para add ao estoque: ");
			int quantidade = sc.nextInt();
			produto.addProdutos(quantidade);
			
			System.out.println();
			System.out.println("Update: " + produto);
			
			System.out.println();
			System.out.print("Digite o numero de produtos para remover do estoque: ");
			quantidade = sc.nextInt();
			produto.removeProdutos(quantidade);
			
			System.out.println();
			System.out.println("Update: " + produto);
			
			sc.close();
	}
}

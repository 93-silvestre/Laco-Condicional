package br.com.generation.atividade1;

import java.util.Scanner;

public class LacoDeDecisao04 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int numero; 
		int resposta;
		
		System.out.println("Digite um n�mero:");
		numero = entrada.nextInt();
		resposta = numero %2;
		
		
		if(resposta == 0) {
			System.out.println("O n�mero informado � par \n");
			System.out.println("\n A raiz quadrada �: " + Math.sqrt(numero));
		}
		else{
			System.out.println("O n�mero informado � impar \n");
			System.out.println("\n O valor do n�mero elevado ao quadrado � " + Math.sqrt(numero));			
	
		
		}
			
	}
}

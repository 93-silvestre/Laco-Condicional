package br.com.generation.atividade1;

import java.util.Scanner;

public class LacoDeDecisao04 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int numero; 
		int resposta;
		
		System.out.println("Digite um número:");
		numero = entrada.nextInt();
		resposta = numero %2;
		
		
		if(resposta == 0) {
			System.out.println("O número informado é par \n");
			System.out.println("\n A raiz quadrada é: " + Math.sqrt(numero));
		}
		else{
			System.out.println("O número informado é impar \n");
			System.out.println("\n O valor do número elevado ao quadrado é " + Math.sqrt(numero));			
	
		
		}
			
	}
}

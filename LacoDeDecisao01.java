package br.com.generation.atividade1;

import java.util.Scanner;

public class LacoDeDecisao01 {
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int contador;
		int maior = 0;
		
		for(contador = 1; contador<=5; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			
		} 
		if(numero > maior) {
			maior = numero;
		}
		
		System.out.println("O maior dos n�meros lidos �: " + maior);

     }
	
  }

package br.com.generation.atividade1;

import java.util.Scanner;

public class LacoDeDecisao03 {

	public static void main(String[] args) {
			 
			Scanner entrada = new Scanner(System.in);
			
			int idade;
			int categoria;
			
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			
			if(idade >= 5 && idade<= 7) {
				System.out.println("Nadador da categoria Infantil A");
			}
			
			else if(idade >= 8 && idade <= 11) {
				System.out.println("Nadador da categoria Infantil B");
			}
			
			else if(idade >= 12 && idade <= 13) {
				System.out.println("Nadador da categoria Infantil A");
			}
			
			else if(idade >= 14 && idade <= 17) {
				System.out.println("Nadador da categoria Infantil B");
			}	
	}
									
						
}
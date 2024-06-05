package main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner (System.in); 
		
		float salario, abono, salarioTotal;
		
		System.out.println("Digite o Salario");
		salario = ler.nextFloat();
		
		System.out.println("Digite o Abono");
		abono = ler.nextFloat();
		
		salarioTotal = salario + abono;
		System.out.printf("Seu salario Total é: %.2f", salarioTotal);
		
		
		
		ler.close();
	}

}

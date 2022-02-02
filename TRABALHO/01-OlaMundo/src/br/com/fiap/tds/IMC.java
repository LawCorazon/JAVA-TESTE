package br.com.fiap.tds;

import java.util.Scanner;

public class IMC {
     
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digita tua altura:");
			double altura = sc.nextDouble();
			System.out.println("digita o seu peso:");
			int peso = sc.nextInt();
			
			altura *= altura;
			double IMC = peso/altura;
			System.out.println("IMC é: "+ IMC);
			
			
			if(IMC >= 18.5 && IMC <= 25) {
				System.out.println("esta no peso ideal");
			} else {
				System.out.println("Esta fora do corpo ideal segundo o IMC");
			}
			
			
			sc.close();
		}
}

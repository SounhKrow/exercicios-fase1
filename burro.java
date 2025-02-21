package control;

import java.util.Scanner;

public class burro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		
		/*
		  
		 System.out.print("digite O primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.print("digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		
		System.out.print("resultado da soma: " +num3);
		
		*/
		
		//2
		
		/*
		 
		 System.out.print("Digite o daio do circulo: ");
		int raio = sc.nextInt();
		System.out.print("A area do circulo é: " +(3.14159 * (raio * raio)));
		
		*/
		
		//3
		
		/*
		 
		 System.out.print("Digite a temperatura em celsius do ambiente: ");
		int celsius = sc.nextInt();
		System.out.print("a temperatura em Fahrenheit é: " +(celsius * (9 / 5) + 32));
		
		*/
		
		//4
		
		/*
		 
		 System.out.print("Digite o primeiro numero: ");
				double num1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
				double num2 = sc.nextFloat();
		System.out.print("Digite o terceiro numero: ");
				double num3 = sc.nextFloat();
	    System.out.print("A média é: " +((num1 + num2 + num3) / 3));
	    
	    */
		
		//5
		
		/*
		 
		 System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Sua idade em dias é: " +(idade * 365));
		
		*/
		
		//6
		
		/*
		 System.out.print("Digite seu salário: ");
		double salario = sc.nextFloat();
		System.out.print("Digite a porcentagem do desconto do INSS: ");
		double desconto = sc.nextFloat();
		System.out.print("O valor liquido é: " +(salario * (desconto / 100)));
		
		*/
		
		//7
		
		/*
		  System.out.print("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.print("Digite a altura: ");
		int altura = sc.nextInt();
		System.out.print("O valor da area é: " +(base * altura));
		System.out.print("O valor do perimetro é: " +(2 * (base + altura)));
		
		*/
		
		//8
		
		/*
		 
		 System.out.print("Digite o raio de uma esfera: ");
		int raio = sc.nextInt();
		System.out.print("O volume da esfera é: " +((4/3) * 3.14159 * (raio * raio * raio)));
		
		*/
		
		//9
		
		/*
		 
		 System.out.print("Digite um valor em reais: ");
		int real = sc.nextInt();
		System.out.print("Digite a cotação do dolar: ");
		int cotação = sc.nextInt();
		System.out.print("O valor em dolar é: " +(real * cotação));
		
		*/
		
		//10
		
		System.out.print("Didigte a coordenada de x1: ");
		double x1 = sc.nextInt();
		System.out.print("Digite a coordenada de y1: ");
		double y1 = sc.nextInt();
		System.out.print("Digite a coordenada de x2: ");
		double x2 = sc.nextInt();
		System.out.print("Digite a coordenada de y2: ");
		double y2 =sc.nextInt();
		System.out.println("A distancia é: " +(Math.sqrt(((x2 * x1) * (x2 * x1)) + ((y2 * y1) * (y2 * y1)))));
	}
	
}




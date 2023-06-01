package exercicios;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Insira um valor");
		a = leitor.nextDouble();
		
		System.out.println("Insira outro valor");
		b = leitor.nextDouble();
		
		if(a > b){
		System.out.println(a + " é maior que " + b);
		}else if(b > a){
			System.out.println(b + " é maior que " + a);
		}else{
			System.out.println("Numeros iguais");
		}
	}
}
package exercicios;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a,b,c;
		int negativo = 0;
		
		System.out.println("Digite 3 numeros, cada um pode ser positivo ou negativo");
		System.out.println("Digite o primeiro numero");
		a = leitor.nextInt();
		if(a < 0) {
			negativo++;
		}
		System.out.println("Digite o segundo numero");
		b = leitor.nextInt();
		if(b < 0) {
			negativo++;
		}
		System.out.println("Digite o terceiro numero");
		c = leitor.nextInt();
		if(c < 0) {
			negativo++;
		}
		
		System.out.println("Quantidade de numeros negativos digitados: "+negativo);
	}

}

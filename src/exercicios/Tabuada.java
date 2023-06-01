package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um numero para ver a tabuada dele");
		num = leitor.nextDouble();
		
		System.out.println("Tabuada do "+num);
		for(int i = 0; i < 11; i++) {
			System.out.println(num + " x " + i + " = "+ num * i);
		}
	}
}

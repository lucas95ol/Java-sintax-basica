package exercicios;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		soma();
			}

	private static void soma() {
	//Crie um programa que pergunte 3 valores ao usuário e imprima a soma desses valores. Dica: usar uma variável para a soma.
		Scanner leitor = new Scanner(System.in);
		double a,b,c,res;
		System.out.println("Digite o primeiro número: ");
		a = leitor.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = leitor.nextDouble();
		System.out.println("Digite o terceiro número: ");
		c = leitor.nextDouble();
		
		res = a + b + c;
		
		System.out.println("Soma: "+ res);
	}

}

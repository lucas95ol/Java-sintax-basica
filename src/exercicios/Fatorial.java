package exercicios;
import java.util.Scanner;


public class Fatorial {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero para saber o fatorial dele:");
		int num = leitor.nextInt();
        int total = 1;

		for(int i = num; i >= 1; i--) {
			total = total * i;
		}

        System.out.println("O resultado é: " + total);
	}
}

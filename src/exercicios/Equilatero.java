package exercicios;
import java.util.Scanner;

public class Equilatero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double lado1, lado2,lado3;
		
		System.out.println("Digite o tamanho do primeiro lado do triângulo");
		lado1 = leitor.nextDouble();
		System.out.println("Digite o tamanho do segundo lado do triângulo");
		lado2 = leitor.nextDouble();
		System.out.println("Digite o tamanho do terceiro lado do triângulo");
		lado3 = leitor.nextDouble();
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilátero");
		} else {
			System.out.println("Não é equilátero");
		}	
	}
}

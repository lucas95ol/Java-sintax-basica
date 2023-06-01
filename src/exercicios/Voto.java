package exercicios;
import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade =  leitor.nextInt();
		
		if(idade < 16) {
			System.out.println("Você não pode votar ainda");
		} else if(idade > 70 || idade == 16 || idade == 17){
			System.out.println("Seu voto é facultativo");
		} else {
			System.out.println("Seu voto é obrigatório");
		}
	}

}

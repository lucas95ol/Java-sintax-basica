package exercicios;
import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String a = "";
        
        System.out.println("Digite o máximo de asteriscos que você deseja desenhar");
        int tamanho = leitor.nextInt();

		for(int i = 0; i < tamanho; i++) {
            a += "*";
			System.out.println(a);
        }
	}
}


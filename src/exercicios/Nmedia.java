package exercicios;

import java.util.Scanner;

public class Nmedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos numeros voce deseja somar:");
        int repeticao = leitor.nextInt();
        
        double valor, n;
        valor = 0;


        for(int i = 0; i < repeticao; i++){
            System.out.println("Digite o " +(i+1)+"º numero" );
            n = leitor.nextDouble();
            valor = valor + n;
        }

        System.out.println("Resultado: "+valor);
    }
}
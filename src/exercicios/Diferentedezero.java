package exercicios;

import java.util.Scanner;

public class Diferentedezero{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor = 0;

        do{
            System.out.println("Digite um valor");
            valor = leitor.nextInt();
        }

        while(valor != 0);
    }
}
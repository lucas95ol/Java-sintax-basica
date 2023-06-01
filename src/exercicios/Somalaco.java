package exercicios;

import java.util.Scanner;

public class Somalaco {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double val, n;

        val = 0;
        
        System.out.println("insira 5 numeros a seguir:");

        for(int i = 0; i < 5; i++){
            System.out.println("insira o " + (i + 1) +"° numero");
            n = leitor.nextDouble();
            val = val + n;
        }

        System.out.println(val);
    }
}

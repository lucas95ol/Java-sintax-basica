package exercicios;
import java.util.Scanner;

public class Lacomedia{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double val, n;

        val = 0;

       System.out.println("Digite 5 numeros para somá-los");
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " +(i+1)+"º numero" );
            n = leitor.nextDouble();

            val = val + n;
        }

        System.out.println(val);
    }
}
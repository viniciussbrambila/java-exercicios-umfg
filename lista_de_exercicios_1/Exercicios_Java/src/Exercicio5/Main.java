package Exercicio5;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
            System.out.println("Digite o numero A:");
            float A = ler.nextInt();

            System.out.println("Digite o numero B:");
            float B = ler.nextInt();

            System.out.println("Digite o numero C:");
            float C = ler.nextInt();

            float X = 4*A + 5*B - 3*C + A*B + A*C - (B*C)/2;

            System.out.println("O resultado é:"+X);





    }
}

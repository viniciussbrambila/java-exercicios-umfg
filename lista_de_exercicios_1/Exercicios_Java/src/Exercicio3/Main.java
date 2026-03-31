package Exercicio3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");

        int num = ler.nextInt();
        int num0 = num;
        num += 5;
        num *= 4;
        num /= 8;

        System.out.println("O resultado do numero digitado "+ num0 +" somado a 5,multiplicado por 4 e divido por 8 é:"+ num);






    }
}

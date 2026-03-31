package Exercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("--Somador de numeros--");
        System.out.println("Digite o primeiro numero:");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = ler.nextInt();

        System.out.println("Digite o terceiro numero:");
        int num3 = ler.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma dos 3 numeros é:"+ soma);







    }
}

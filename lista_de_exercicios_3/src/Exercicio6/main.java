package Exercicio6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.println("Digite um numero inteiro para ver seu fatorial:");
        num = sc.nextInt();
        long valor = num;
        long fatorial = num -1;
        System.out.print(num+"!= "+num);
        while (fatorial > 0){
            System.out.print(" x "+fatorial+" ");
            num = num * fatorial;
            fatorial--;


        }
        System.out.print("= "+num);

    }
}

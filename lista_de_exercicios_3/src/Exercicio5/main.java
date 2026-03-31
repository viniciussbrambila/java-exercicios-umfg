package Exercicio5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,invertido = 0;
        String palavra;

        System.out.println("Digite um numero inteiro positivo:");
        num = sc.nextInt();
        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num = num / 10;
        }
        System.out.println("O numero invertido è:"+invertido);
        System.out.println("Informe uma palavra:");
        palavra = sc.next();

        for (int i = palavra.length() -1 ;i >= 0;i--){
            char caractere = palavra.charAt(i);
            System.out.print(caractere);
        }

    }
}

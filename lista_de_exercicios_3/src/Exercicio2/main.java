package Exercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num,primeironum = 0,segundonum = 1,terceironum = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo pra ver a sequencia de Fibonacci:");
        num = ler.nextInt();
        if (num%2 == 0){
            for (int i = 0;i < num;i++){
                System.out.print("-"+primeironum+"-");
                int proximonum = primeironum + segundonum;
                primeironum = segundonum;
                segundonum = proximonum;
            }



        }
    }
}

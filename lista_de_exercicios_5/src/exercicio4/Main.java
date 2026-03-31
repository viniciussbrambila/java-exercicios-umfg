package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,fatorial;

        System.out.println("informe o fatorial:");
        num = sc.nextInt();

        fatorial = calculoFatorial(num);
        imprimirResultado(num,fatorial);

    }
    public static int calculoFatorial(int numero){
        if (numero == 0) {
            return 1;
        }
        for (int i = numero; i > 1;i-- ){
            numero *= (i-1);

        }
        return numero;
    }
    public static void imprimirResultado(int numeroOriginal, int valorFatorial) {
        System.out.println("O fatorial de " + numeroOriginal + "! é: " + valorFatorial);
    }
}

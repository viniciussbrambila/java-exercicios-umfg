package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,fatorial;

        System.out.println("informe o fatorial:");
        num = sc.nextInt();

        fatorial = fatorialRecursivo(num);
        imprimirResultado(num,fatorial);

    }
    public static int fatorialRecursivo(int numero){
        if (numero == 0) {
            return 1;
        }else {
            int resultado = numero * fatorialRecursivo(numero -1);

            return resultado;
        }


    }
    public static void imprimirResultado(int numeroOriginal, int valorFatorial) {
        System.out.println("O fatorial de " + numeroOriginal + "! é: " + valorFatorial);
    }

}

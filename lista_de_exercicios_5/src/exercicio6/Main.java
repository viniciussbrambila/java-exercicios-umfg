package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,total;

        System.out.println("Digite um numero para ver a soma de 1 até ele: ");
        n = sc.nextInt();
        total = somaTodosNumeros(n);
        System.out.println(total);


    }
    public static int somaTodosNumeros(int num){
        if (num == 0) {
            return 0;
        }
        return num + somaTodosNumeros(num -1);
    }
}

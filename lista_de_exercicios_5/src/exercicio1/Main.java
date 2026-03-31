package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("--Comparador de numeros--");
        num1 = digitaNumero(sc);
        num2 = digitaNumero(sc);
        num3 = digitaNumero(sc);




        System.out.println("O maior valor é: "+maiorValor(num1,num2,num3));
        System.out.println("O menor valor é: "+menorValor(num1,num2,num3));



    }
    public static int digitaNumero(Scanner sc){
            System.out.println("Digite um numero:");
        return sc.nextInt();

    }
    public static int maiorValor(int a,int b,int c){
        int maior;
         maior = c;
        if (a > b && a > c){
         maior = a;
        } else if (b > a && b > c) {
            maior = b;
        }
        return maior;
    }
    public static int menorValor(int a,int b,int c){
        int menor;
        menor = c;
        if (a < b && a < c){
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        }
        return menor;
    }



}


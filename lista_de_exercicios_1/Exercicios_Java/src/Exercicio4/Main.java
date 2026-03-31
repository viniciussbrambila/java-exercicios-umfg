package Exercicio4;
import java.util.Scanner;
public class Main {
   public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
       System.out.println("Calculando a area de um retângulo");
        System.out.println("Escreva um valor para a base de um retângulo:");
        float base = ler.nextFloat();

       System.out.println("escreva um valor para altura do retângulo:");
        float altura = ler.nextFloat();

        float area = base * altura;

       System.out.println("A area do retângulo é:"+area+" m²");



   }
}

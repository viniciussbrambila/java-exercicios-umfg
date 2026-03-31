package Exercicio4;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    String palavra1,palavra2;

    System.out.print("Escreva uma palavra:");
    palavra1 = ler.next();

    System.out.print("Escreva outra palavra:");
    palavra2 = ler.next();

    if (palavra1.equalsIgnoreCase(palavra2)){
        System.out.println("As palavras "+palavra1+" e "+palavra2+ " são iguais!!!");
    }else{
        System.out.println("AS palavras "+palavra1+" e "+palavra2+ " são diferentes");
    }






}
}

package Exercicio1;
import java.util.Scanner;
public class Main {
public static void main (String[] args){

    Scanner ler = new Scanner(System.in);
    String palavra;

    System.out.println("Escreva uma palavra:");
    palavra = ler.next();
    int tamanho = palavra.length();

    if (tamanho > 20) {
        System.out.println("A palavra é muito grande:");
    }else{
        System.out.println("A palavra é pequena");
    }


}
}

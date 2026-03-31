package Exercicio7;
import java.util.Scanner;
public class main {
public static void main (String[] args){
    String p1,p2,p3;

    Scanner ler = new Scanner(System.in);
    System.out.println("Escreva uma palavra:");
    p1 = ler.next();
    System.out.println("Escreva mais uma palavra:");
    p2 = ler.next();
    System.out.println("Escreva uma ultima palavra");
    p3 = ler.next();

    if (p1.length() > p2.length() & p1.length() > p3.length()){
        System.out.println("A maior palavra é "+p1);
    }
    else if (p2.length() > p1.length() & p2.length() > p3.length()) {
        System.out.println("A maior palavra é "+p2);
    } else if (p3.length() > p1.length() & p3.length() > p2.length()) {
        System.out.println("A maior palavra é "+p3);
    }else{
        System.out.println("Duas ou mais palavras possuem o mesmo tamanho.");
    }
}
}


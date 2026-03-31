package Exercicio5;
import java.util.Scanner;

public class main {
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    String palavra;

    int numero;
    System.out.println("Digite uma palavra:");
    palavra = ler.nextLine();
    char primeiraLetra = palavra.charAt(0);
    String vogais = "aeiou";
    String consoantes = "bcdfghjklmnpqrstvwxyz";

    if (vogais.indexOf(primeiraLetra) != -1){
     System.out.println("A palavra comeca com vogal");
    }
    else if (consoantes.indexOf(primeiraLetra) != -1){
        System.out.println("A palavra começa com consoante!");
    }
    else{
        System.out.println("Digito invalido!!");
    }
   
}
}

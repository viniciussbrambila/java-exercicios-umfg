package Exercicio2;
import java.util.Scanner;
public class Main {
public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    String email;
    System.out.println("Digite um email:");
    email = ler.next();

    if (email.endsWith(".com") & email.contains("@") ) {
        System.out.println("E-mail válido");
    }else {
        System.out.println("E-mail inválido");
    }
}


}

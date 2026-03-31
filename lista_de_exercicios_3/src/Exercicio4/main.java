package Exercicio4;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        int contador = 0;
        System.out.println("Lista de nomes");
        do {
            System.out.println("Escreva um nome,digite fim para parar e mostrar me tela os nomes que você escreveu: ");
            palavra = sc.nextLine();
            if (!palavra.equals("fim") ){
                contador++;
            }
        }while (!palavra.equals("fim"));
        System.out.println("quantidade de nomes:"+contador);
    }
}

package Exercicio3;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array ={"Leonardo","Mayara","Diego","Carlos","Lucas","Maria"};
        String nome;
        int posicao = 0;
        System.out.println("---Lista de nomes---");
        System.out.println("Digite um nome:");
        nome = sc.nextLine();

        for (int i = 0;i < array.length;i++){
            posicao++;
            if (nome.equalsIgnoreCase(array[i]) ){
                System.out.println("O nome existe na posição "+posicao);

            }
        }




    }
}

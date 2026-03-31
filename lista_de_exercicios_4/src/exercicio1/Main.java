package exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 6;
        int[] vetor = new int[max];
        int maior = 0,menor = 0,soma = 0,media;

        for (int i = 0; i < max; i++){
            System.out.println("Digite um numero pra preencher o array:");
            vetor[i] = sc.nextInt();
            soma = vetor[i] + soma;

        }
        maior = vetor[0];
        menor = vetor[0];
        for (int i = 0; i < max; i++){

            if (maior < vetor[i]){
                maior = vetor[i];
            }


            if (menor > vetor[i]){
                menor = vetor[i];
            }
        }



        System.out.print("Os numeros digitados foram: ");
        for (int numeros : vetor){

            System.out.print(numeros+" ");
        }
        System.out.println();
        System.out.println("O maior numero é "+maior);
        System.out.println("O menor numero é "+menor);
        System.out.println("A média dos valores é:"+soma /5);






    }
}

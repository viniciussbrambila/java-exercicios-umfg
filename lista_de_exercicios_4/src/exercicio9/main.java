package exercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int soma = 0,opcao;
        numeros.add(3);
        numeros.add(5);
        numeros.add(18);
        numeros.add(33);
        numeros.add(2);
        numeros.add(96);
        numeros.add(30);
        numeros.add(47);
        numeros.add(10);
        numeros.add(8);
        System.out.println("ArrayList de 10 numeros");
        System.out.println("Escolha uma opção:");
        do {
        System.out.println("1- Exibir todos os números");
        System.out.println("2- Exibir apenas os pares");
        System.out.println("3- Exibir apenas os ímpares");
        System.out.println("4- Exibir a soma de todos os elementos");
        System.out.println("5- Exibir o maior e o menor número. ");
        System.out.println("0- Sair");
        opcao = sc.nextInt();
        switch (opcao){
            case 1: {
                System.out.println("Exibindo todos os numeros da ArrayList:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
                System.out.println();
                break;
            }
            case 2:{
                System.out.println();
                System.out.println("Numeros pares: ");
                for (int i = 0;i < numeros.size();i++){
                    if ((numeros.get(i) % 2) == 0){
                        int par = numeros.get(i);
                        System.out.print(par+" ");
                    }
                }
                break;
            }
            case 3:{
                System.out.println();
                System.out.println("Numeros impares: ");
                for (int i = 0;i < numeros.size();i++){

                    if ((numeros.get(i) % 2) == 1){
                        int impar = numeros.get(i);
                        System.out.print(impar+" ");
                    }
                }
                break;
            }
            case 4:{
                for (int i = 0;i < numeros.size();i++){
                    soma = numeros.get(i) + soma;

                }
                System.out.println("A soma dos numeros é: "+soma);
                break;
            }
            case 5:{
                int maior = numeros.get(0);
                int menor = numeros.get(0);
                for (int i = 0;i < numeros.size();i++){
                    if (numeros.get(i) > maior){
                        maior = numeros.get(i);
                    }else if (numeros.get(i) < menor){
                        menor = numeros.get(i);
                    }
                }
                System.out.println("Maior numero: "+maior);
                System.out.println("Menor numero: "+menor);
                break;
            }
            case 0:{
                System.out.println("Saindo...");
                break;
            }
            default:{
                System.out.println("Valor invalido!!! Tente novamente.");
            }
        }

        }while(opcao !=0);




    }
}

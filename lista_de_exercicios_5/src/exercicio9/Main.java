package exercicio9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        try {
            int numUsuario = sc.nextInt();

            int resultado = dobrarNumeroPositivo(numUsuario);
            System.out.println("O dobro de " + numUsuario + " é: " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("ERRO: O valor digitado não é um número inteiro.");
        }

    }
    public static int dobrarNumeroPositivo(int numero) {

        if (numero < 0) {

            throw new IllegalArgumentException("Número não pode ser negativo");
        }

        return numero * 2;
    }

}
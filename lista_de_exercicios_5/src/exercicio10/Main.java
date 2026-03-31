package exercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            double num1 = sc.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = sc.nextDouble();

            System.out.println("Digite o operador (+, -, *, /):");
            char op = sc.next().charAt(0);

            double resultado = calcular(num1, num2, op);
            System.out.println("Resultado: " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Você deve digitar um número.");

        } finally {
            System.out.println("Operação finalizada");

        }
    }
    public static double calcular(double num1, double num2, char operador) {

        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }
}

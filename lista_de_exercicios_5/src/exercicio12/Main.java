package exercicio12;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        System.out.println("--- Cadastro de Notas de Alunos ---");
        System.out.println("(Digite -1 para encerrar o cadastro)");

        while (true) {
            try {
                System.out.print("Digite a nota (0.0 a 10.0): ");
                double notaInput = sc.nextDouble();

                if (notaInput == -1) {
                    break;
                }

                adicionarNota(notas, notaInput);

                System.out.println("Nota " + notaInput + " adicionada com sucesso.");

            } catch (InputMismatchException e) {
                System.out.println("Erro de Formato: Por favor, digite um NÚMERO (ex: 8,5).");
                sc.next();

            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }

        System.out.println("\n------------------------------");
        System.out.println("--- CADASTRO ENCERRADO ---");
        System.out.println("------------------------------");

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi cadastrada.");
        } else {
            System.out.println("Notas cadastradas:");
            double soma = 0;

            for (double nota : notas) {
                System.out.println("- " + nota);
                soma += nota;
            }

            double media = soma / notas.size();

            System.out.println("\nTotal de notas: " + notas.size());
            System.out.printf("Média da turma: %.2f\n", media);
        }
    }
    public static void adicionarNota(List<Double> lista, double nota) throws Exception {
        if (nota < 0 || nota > 10) {
            throw new Exception("Nota inválida! Deve ser entre 0 e 10.");
        }
        lista.add(nota);
    }
}
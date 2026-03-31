package exercicio6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diaspormes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] calendario = new int[12][];
        int mesdigitado;

        for (int i = 0; i < calendario.length; i++) {
            calendario[i] = new int[diaspormes[i]];
        }

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) { // Usando calendario[i].length
                calendario[i][j] = j + 1;
            }
        }

        System.out.println("Calendario");
        System.out.println("Escolha um mês do calendario:");
        System.out.println("| 1-Janeiro | 2-Fevereiro | 3-Março | 4-Abril | 5-Maio | 6-Junho |");
        System.out.println("| 7-Julho   | 8-Agosto    | 9-Setembro| 10-Outubro| 11-Novembro| 12-Dezembro|");
        mesdigitado = sc.nextInt();

        if (mesdigitado >= 1 && mesdigitado <= 12) {

            int mesIndice = mesdigitado - 1;

            System.out.println("\n--- Mês " + mesdigitado + " ---");

            int[] diasDoMesEscolhido = calendario[mesIndice];


            for (int i = 0; i < diasDoMesEscolhido.length; i++) {
                System.out.print(diasDoMesEscolhido[i] + "\t");
                if ((i + 1) % 7 == 0) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("Mês inválido. Por favor, digite um número entre 1 e 12.");
        }
    }
}
package exercicio7;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diaspormes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] calendario = new int[12][];


        for (int i = 0; i < calendario.length; i++) {
            calendario[i] = new int[diaspormes[i]];
        }

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) { // Usando calendario[i].length
                calendario[i][j] = j + 1;
            }
        }
        System.out.println("===== TODOS OS DIAS DO ANO =====");

        for(int[] mes : calendario){
            for(int dia : mes){
                System.out.println(dia + " ");
            }
        }

    }
}
package exercicio5;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]  m = new int[2][2];
        int[][]  m2 = new int[2][2];
        int [][] matrizmultiplicada = new int[2][2];
        System.out.println("Multiplicador de matrizes");
        System.out.println("Array1");
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m.length;j++){
                System.out.println("preencha a linha "+i+" coluna "+j+" :");
                m[i][j] = sc.nextInt();

            }
        }
        System.out.println("Array 2");
        for (int i = 0;i < m2.length;i++){
            for (int j = 0;j < m2.length;j++){
                System.out.println("preencha a linha "+i+" coluna "+j+" :");
                m2[i][j] = sc.nextInt();

            }
        }
        //multiplicaçao
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    matrizmultiplicada[i][j] += m[i][k] * m2[k][j];
                }
            }
        }


        System.out.println("Matriz multiplicada");
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m.length;j++){
                System.out.print("|"+matrizmultiplicada[i][j]+"|");


            }
            System.out.println();
        }




    }
}

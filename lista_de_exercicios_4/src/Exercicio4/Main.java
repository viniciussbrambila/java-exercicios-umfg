package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] matriz = new float[3][3];
        float aluno1 = 0,aluno2 = 0,aluno3 = 0;
        int cont = 0;

        for (int i = 0;i < matriz.length;i++){

            for (int j = 0;j < matriz.length;j++){
                System.out.println("Digite a nota "+(j+1)+ " do aluno "+ (i+1) +":");
                matriz[i][j] = sc.nextFloat();
            }
        }
        aluno1 = (matriz[0][0] + matriz[0][1] + matriz[0][2]) /3;
        aluno2 = (matriz[1][0] + matriz[1][1] + matriz[1][2]) /3;
        aluno3 = (matriz[2][0] + matriz[2][1] + matriz[2][2]) /3;

        System.out.println("Media do aluno 1: "+aluno1);
        System.out.println("Media do aluno 2: "+aluno2);
        System.out.println("Media do aluno 3: "+aluno3);

        if (aluno1 > aluno2 && aluno1 > aluno3){
            System.out.println("O aluno 1 teve a maior média");
        }else if (aluno2 > aluno3 && aluno2 > aluno1) {
            System.out.println("O aluno 2 teve a maior média");
        }else if (aluno3 > aluno2 && aluno3 > aluno1) {
            System.out.println("O aluno 3 teve a maior média");
        }else {
            System.out.println("Mais de um aluno teve a maior media.");
        }





    }
}

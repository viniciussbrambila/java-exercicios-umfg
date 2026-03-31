package exercicio12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String, Float> alunos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String nomealuno;

        alunos.put("vinícius", 10.0F);
        alunos.put("mayara", 8.6F);
        alunos.put("diego", 7.5F);
        alunos.put("carlos", 9.3F);
        alunos.put("pedro", 5.0F);
        System.out.println(" " + alunos);

        for (int i = 0; i < 1; i++) {
            System.out.println("Digite o nome do aluno para ver a nota:");
            nomealuno = sc.nextLine().toLowerCase();
            System.out.println(alunos.get(nomealuno));

        }
        float maiorNota = -1.0F;
        String alunomaiornota = "";


        for (Map.Entry<String, Float> entry : alunos.entrySet()) {
            String alunoAtual = entry.getKey();
            float notaAtual = entry.getValue();


            if (notaAtual > maiorNota) {
                maiorNota = notaAtual;
                alunomaiornota = alunoAtual;
            }
        }
        System.out.println("O aluno com a maior nota é: " + alunomaiornota+" e a nota foi: " + maiorNota);




    }
}

package exercicio13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        List<String> inscricoes = new ArrayList<>();

        inscricoes.add("vinícius");
        inscricoes.add("maria");
        inscricoes.add("joão");
        inscricoes.add("ana");
        inscricoes.add("vinícius");
        inscricoes.add("pedro");
        inscricoes.add("maria");
        inscricoes.add("vinícius");

        System.out.println("Lista Completa de Inscrições ");
        System.out.println(inscricoes);
        System.out.println("Total de inscrições realizadas (com duplicatas): " + inscricoes.size());

        Set<String> alunosUnicos = new HashSet<>(inscricoes);

        System.out.println("\nAlunos Únicos Inscritos ");
        System.out.println("Quantidade de alunos únicos: " + alunosUnicos.size());
        System.out.println("Nomes dos alunos únicos: " + alunosUnicos);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVerificar Inscrição de Aluno ");
        System.out.print("Digite o nome do aluno que deseja verificar: ");
        String nomeParaBusca = scanner.nextLine().toLowerCase();

        if (alunosUnicos.contains(nomeParaBusca)) {
            System.out.println("Sim, o aluno '" + nomeParaBusca + "' está inscrito no curso!");
        } else {
            System.out.println("Não, o aluno '" + nomeParaBusca + "' não foi encontrado na lista de inscritos.");
        }

        System.out.println("\nAnálise de Inscrições Duplicadas");

        Map<String, Integer> contagemNomes = new HashMap<>();


        for (String nome : inscricoes) {
            contagemNomes.put(nome, contagemNomes.getOrDefault(nome, 0) + 1);
        }

        System.out.println("Alunos com mais de uma inscrição:");
        for (Map.Entry<String, Integer> entry : contagemNomes.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("- O aluno '" + entry.getKey() + "' se inscreveu " + entry.getValue() + " vezes.");
            }
        }

    }
}

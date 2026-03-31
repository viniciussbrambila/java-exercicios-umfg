package exercicio14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        List<String> votos = new ArrayList<>();
        votos.add("Mariana");
        votos.add("Lucas");
        votos.add("Sofia");
        votos.add("Lucas");
        votos.add("Mariana");
        votos.add("Lucas");
        votos.add("Mariana");
        votos.add("João");
        votos.add("Sofia");
        votos.add("Lucas");

        System.out.println("Lista de Todos os Votos Recebidos");
        System.out.println(votos);
        System.out.println("Total de votos computados: " + votos.size());

        Set<String> candidatosUnicos = new HashSet<>(votos);
        System.out.println("\nCandidatos que Receberam Votos");
        System.out.println(candidatosUnicos);

        Map<String, Integer> contagemVotos = new HashMap<>();


        for (String voto : votos) {
            contagemVotos.put(voto, contagemVotos.getOrDefault(voto, 0) + 1);
        }

        System.out.println("\nApuração dos Votos");


        String vencedor = "";
        int maxVotos = -1;

        for (Map.Entry<String, Integer> entry : contagemVotos.entrySet()) {
            String candidato = entry.getKey();
            int quantidadeDeVotos = entry.getValue();

            System.out.println("- " + candidato + " recebeu " + quantidadeDeVotos + " voto(s).");

            if (quantidadeDeVotos > maxVotos) {
                maxVotos = quantidadeDeVotos;
                vencedor = candidato;
            }
        }

        System.out.println("\nO candidato vencedor é: " + vencedor + " com " + maxVotos + " votos!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nConsulta de Votos por Candidato");
        System.out.print("Digite o nome de um candidato para ver seus votos: ");
        String candidatoConsulta = scanner.nextLine();

        int votosRecebidos = contagemVotos.getOrDefault(candidatoConsulta, 0);

        System.out.println("O candidato '" + candidatoConsulta + "' recebeu " + votosRecebidos + " voto(s).");
    }
}

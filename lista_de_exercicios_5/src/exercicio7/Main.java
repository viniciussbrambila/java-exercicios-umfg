package exercicio7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("--Inversor de palavras--");
        System.out.println("Escreva uma palavra para inverter:");
        palavra = sc.nextLine();

        String palavrainvertida = inverterPalavra(palavra);

        System.out.println("Palavra invertida: " + palavrainvertida);

    }

    public static String inverterPalavra(String p) {

        if (p.isEmpty() || p.length() == 1) {
            return p;
        }

        char primeiroCaractere = p.charAt(0);

        String restoDaString = p.substring(1);

        return inverterPalavra(restoDaString) + primeiroCaractere;
    }
}
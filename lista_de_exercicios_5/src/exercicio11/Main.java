package exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        System.out.println("(Ou digite 'nulo' para testar a exceção):");
        String entradaDoUsuario = sc.nextLine();

        String stringParaTestar;

        if (entradaDoUsuario.equalsIgnoreCase("nulo")) {
            stringParaTestar = null;
        } else {
            stringParaTestar = entradaDoUsuario;
        }

        try {
            int resultado = contarMinusculas(stringParaTestar);
            System.out.println("'" + entradaDoUsuario + "' tem " + resultado + " caracteres minúsculos.");

        } catch (NullPointerException e) {
            System.out.println("Exceção capturada com sucesso!");
            System.out.println("Mensagem: " + e.getMessage());
        }

        System.out.println("\n--- O programa continua executando ---");
        System.out.println("Tratamento de exceção bem sucedido.");
    }
    public static int contarMinusculas(String s) {

        if (s == null) {
            throw new NullPointerException("String não pode ser nula");
        }
        if (s.isEmpty()) {
            return 0;
        }

        char primeiroChar = s.charAt(0);
        String restoDaString = s.substring(1);
        int contagemDoResto = contarMinusculas(restoDaString);

        if (Character.isLowerCase(primeiroChar)) {
            return 1 + contagemDoResto;
        } else {
            return contagemDoResto;
        }
    }
}
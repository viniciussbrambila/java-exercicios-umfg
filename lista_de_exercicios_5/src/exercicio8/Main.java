package exercicio8;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Verificador de Palíndromo ---");
        System.out.println("Digite uma palavra:");

        String palavra = sc.nextLine().trim().toLowerCase();

        if (ePalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" É um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }

    }
    public static boolean ePalindromo(String p) {
        if (p.length() <= 1) {
            return true;
        }
        char primeiraLetra = p.charAt(0);
        char ultimaLetra = p.charAt(p.length() - 1);

        if (primeiraLetra != ultimaLetra) {

            return false;
        }


        String miolo = p.substring(1, p.length() - 1);
        return ePalindromo(miolo);
    }
}
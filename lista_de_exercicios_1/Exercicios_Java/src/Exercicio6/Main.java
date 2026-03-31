package Exercicio6;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        final int constante = 40;
        int chute;
        Scanner ler = new Scanner(System.in);

            System.out.println("Tente adivinhar o numero que estou pensando.");
            System.out.print("Digite o numero:");

            chute = ler.nextInt();


            if (chute != constante) {
                System.out.println("Você errou!!!"+ "Voce digitou "+chute+",o que eu estava pensando é:"+constante);
            } else {
                System.out.println("Parabens,você acertou!!!, o numero "+chute+" é exatamente o que eu estava pensando!!!");
            }



    }
}

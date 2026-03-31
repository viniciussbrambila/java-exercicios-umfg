package Exercicio3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario,senha;

        for (int i = 0;i<3;i++) {
            System.out.println("Login");
            System.out.println("Digite o usuario:");
            usuario = sc.nextLine();

            System.out.println("Digite a senha:");
            senha = sc.nextLine();

            if (usuario.contentEquals("admin") && senha.contentEquals("admin")) {
                System.out.println("Parabéns! Usuario logado");
                break;
            } else if (usuario.contentEquals("admin")) {
                System.out.println("Senha incorreta!!!");
            }
            if (i == 2){
                System.out.println("Que pena você esgotou suas tentativas de login,tente novamente mais tarde.");

            }

        }
    }
}

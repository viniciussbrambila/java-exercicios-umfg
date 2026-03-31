package Exercicio3;
import java.util.Scanner;
public class Main {
public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    String nome,senha;

   System.out.println("Login");
   System.out.println("Digite o nome de usuario:");
   nome = ler.next();

   System.out.println("Digite a senha:");
   senha = ler.next();

   if (nome.equals("admin") & senha.equals("1234")){
       System.out.println("Acesso permitido");
    } else if (!nome.equals("admin") & senha.equals("1234")) {
        System.out.println("Usuário inválido");
      }else if(nome.equals("admin")){
        System.out.println("Senha incorreta");

       }



}
}

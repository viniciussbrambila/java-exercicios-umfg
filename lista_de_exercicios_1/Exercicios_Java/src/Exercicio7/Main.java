package Exercicio7;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        String nome,funcao;
        double salario,gratificacao,desconto;
        Scanner ler = new Scanner(System.in);
       System.out.println("Digite seu nome e sobrenome:");
       nome = ler.next();

       System.out.print("Digite sua função:");
       funcao = ler.next();

       System.out.print("Informe seu salario:");
       salario = ler.nextDouble();

       System.out.print("Digite um valor de gratificação:");
       gratificacao = ler.nextDouble();

       System.out.print("Informe um valor de desconto:");
       desconto = ler.nextDouble();

        double salariofinal = (salario + gratificacao) - desconto;

        System.out.println("• Nome completo: " +nome+"\n"+
                "• Função: " +funcao+"\n"+
                "• Salário: " +salario+"\n"+
                "• Gratificação: " +gratificacao+"\n"+
                "• Desconto: " +desconto+"\n"+
                "• Salário Final:"+salariofinal);










    }
}

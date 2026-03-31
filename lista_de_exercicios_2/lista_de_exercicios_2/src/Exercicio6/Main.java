package Exercicio6;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
    int idade;
    String nao = "Não pode votar";
    String opcional = "Voto opcional";
    String obrigatorio = "Voto obrigatorio";

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite sua idade:");
    idade = ler.nextInt();
    if (idade < 12){
        System.out.println("Criança");
    }else if (idade <=17){
        System.out.println("Adolescente");
     }else if (idade <=59){
        System.out.println("Adulto");
    }else {
        System.out.println("Idoso");
    }
    if (idade <16){
        System.out.println(nao);
    }else if (idade <= 18 || idade > 70){
        System.out.println(opcional);
    }else {
        System.out.println(obrigatorio);
    }






}
}

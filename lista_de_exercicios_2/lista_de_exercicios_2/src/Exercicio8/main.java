package Exercicio8;
import java.util.Scanner;
public class main {
public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    String aluno;
    double prova1,prova2,trabalho,trabalho2,media;
    double mediaprova,mediatrabalho,pesoprova = 0.7, pesotrabalho = 0.3;
    System.out.println("Digite o nome do aluno:");
    aluno = ler.nextLine();

    System.out.println("Digite a nota da prova 1:");
    prova1 = ler.nextDouble();

    System.out.println("Digite a nota da prova 2:");
    prova2 = ler.nextDouble();

    System.out.println("Digite a nota do trabalho 1:");
    trabalho = ler.nextDouble();

    System.out.println("Digite a nota do trabalho 2:");
    trabalho2 = ler.nextDouble();

    mediaprova = (prova1 + prova2) /2;
    mediatrabalho = (trabalho + trabalho2) /2;
    media = (mediaprova * pesoprova) + (mediatrabalho * pesotrabalho);
    System.out.println(media);
    if (media >=6){
        System.out.println("Aluno "+aluno+ " aprovado!!!");
    } else if (media >= 5) {
        System.out.println("Aluno "+aluno+ " em recuperação!!!" );

    }else{
        System.out.println("Aluno "+aluno+ " reprovado!!!");
    }

}
}

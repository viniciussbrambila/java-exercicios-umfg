package Exercicio8;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float aumento10,aumento5;
        Scanner ler = new Scanner(System.in);

    System.out.println("Digite o valor do seu salario:");
        float salario = ler.nextFloat();

    if(salario < 1000){
        aumento10 = (salario * 10) / 100;
        salario = salario + aumento10;
    }else if (salario > 1000){
        aumento5 = (salario * 5) / 100;
        salario = salario + aumento5;
    }

    System.out.println("Seu novo salario é:"+salario);

    }
}

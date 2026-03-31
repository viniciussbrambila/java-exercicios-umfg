package Exercicio9;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    float valor,valodesconto;

    System.out.println("Estou vendendo picanha"+"\n"+"Por qual valor voce acha que eu devo vende-la?:");
        valor = ler.nextFloat();

        if (valor >50.00){
            valodesconto = (valor * 15) /100;
            valor = valor - valodesconto;
            System.out.println("Parabens e faça o L, por esse valor voce ganha um desconto de 15%");
        }
        System.out.println("O valor final é:"+valor);









    }
}

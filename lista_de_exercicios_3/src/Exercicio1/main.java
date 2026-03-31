package Exercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num,inicial = 1;
        System.out.println("Mostrador de pares (👉ﾟヮﾟ)👉"+"\n"+"Digite um numero para motrar os pares positivos até ele:");
        num = ler.nextInt();


        while (inicial <= num){

            if (inicial %2 == 0){
                System.out.print(inicial+"/");
            }
            inicial++;



        }








    }
}

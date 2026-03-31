package Exercicio10;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        float massa,velocidade,energiacinetica,energiapotencial,altura;
        final float aceleracaogravidade = 9.8F;
        System.out.println("Digite o valor da massa:");
        massa = ler.nextFloat();

        System.out.println("Digite o valor da velocidade:");
        velocidade = ler.nextFloat();

        energiacinetica =  massa * (velocidade *= velocidade)  /2;
        energiapotencial = energiacinetica;

        altura = energiapotencial / (massa * aceleracaogravidade);

        System.out.println("A altura (h) é:"+altura);







    }
}

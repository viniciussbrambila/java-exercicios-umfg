package exercicio2;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  array = {10,9,3,4,4,6,4,8,9,10};
        int num,contador = 0;

                System.out.println("Digite um numero para verificar se ele aparece no array:");
                num = sc.nextInt();

                for (int i = 0;i < array.length;i++){
                        if (num == array[i]){
                             contador++;
                        }
                }
                if (contador == 0){
                        System.out.println("O numero "+num+" não aparece nenhuma vez.");
                } else {
                        System.out.println("O numero "+num+" aparece "+contador+" vezes.");
                }






        }
}

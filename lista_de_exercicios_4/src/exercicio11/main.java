package exercicio11;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet();
        int num = 0,usuarionum;

        do{
            System.out.println("Digite um numero: ");
            num = sc.nextInt();

            if(num !=0 ){
                numeros.add(num);
            }
        }while(num != 0);
        System.out.println("Numeros digitados da lista"+numeros);
        System.out.println("Digite um numero para verificar se está na lista: ");
        usuarionum = sc.nextInt();
        if(numeros.contains(usuarionum)){
            System.out.println("O numero "+usuarionum+" esta na lista.");
        }else{
            System.out.println("O numero "+usuarionum+" não esta na lista.");
        }
    }
}
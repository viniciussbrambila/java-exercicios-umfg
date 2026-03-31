package Exercicio9;
import  java.util.Scanner;
public class main {
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int opcao ;
    System.out.println("Bem vindo a pizzaria");
     System.out.println("Escolha uma das opçoes:"+"\n"+
                     "1 – Pizza de Calabresa | valor - (R$ 40,00)"+"\n"+
                     "2 – Pizza de Mussarela | valor - (R$ 38,00)"+"\n"+
                     "3 – Pizza de Frango    | valor - (R$ 42,00)"+"\n"+
                     "4 – Refrigerante       | valor - (R$ 8,00)"+"\n"+
                     "5 – Suco               | valor - (R$ 10,00)");
     opcao = ler.nextInt();
    switch (opcao){
        case 1:
            System.out.println("Voce escolheu a Pizza de Calabresa -- o valor total é R$ 40,00 ");
            break;
        case 2:
            System.out.println("Voce escolheu a Pizza de Mussarela -- o valor total é  R$ 38,00 ");
            break;
        case 3:
            System.out.println("Voce escolheu a Pizza de Frango -- o valor total é  R$ 42,00" );
            break;
        case 4:
            System.out.println("Voce escolheu o Refrigerante -- o valor total é  R$ 8,00" );
            break;
        case 5:
            System.out.println("Voce escolheu o Suco -- o valor total é  R$ 10,00" );
            break;
        default:
            System.out.println("Opção invalida!!!");
    }







}
}

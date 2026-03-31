package Exercicio10;
import java.util.Scanner;
public class main {
public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    String camisa;
    System.out.println("Loja de camisas"+"\n"+"Escolha a cor da camisa que quer comprar:");
    camisa = ler.nextLine();
    
    switch (camisa.toLowerCase()){
        case "vermelha":
            System.out.println("O preço da camisa vermelha é de R$30,00");
            break;
        case "azul":
            System.out.println("O preço da camisa azul é de R$35,00");
            break;
        case "verde":
            System.out.println("O preço da camisa verde é de R$40,00");
            break;
        case "preta":
            System.out.println("O preço da camisa preta  é de R$50,00");
            break;
        default:
            System.out.println("Produto indisponivel");
    }

}
}

package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nomes = new ArrayList<>();
        ArrayList<String> nomefiltrado;
        String nomedigitado = "";
        while(!nomedigitado.equalsIgnoreCase("fim")){
            System.out.println("Digite um nome pra preencher o arraylist:");
            System.out.println("Digite [fim] se quiser encerrar.");
            nomedigitado = sc.nextLine();

            if (!nomedigitado.equalsIgnoreCase("fim")){
                nomes.add(nomedigitado);
            }
        }
        nomefiltrado = listaVetor(nomes);
        System.out.println("Nomes com mais de 5 letras: "+nomefiltrado);


    }
    public static ArrayList<String> listaVetor (ArrayList<String> listaoriginal){
        ArrayList<String> acimaDe5 = new ArrayList<>();

        for(String nome : listaoriginal){
            if (nome.length() > 5 ){
                acimaDe5.add(nome);
            }
        }
        return acimaDe5;
    }
}

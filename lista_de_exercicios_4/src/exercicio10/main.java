package exercicio10;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> fila = new LinkedList<>(); //fila original


        fila.add("Ana");
        fila.add("Mayara");
        fila.add("Lucas");
        fila.add("Diego");
        fila.add("Leonardo");
        List<String> filafinal = new LinkedList<>(fila); //fila modificada


        //removendo dois primeiros
        filafinal.removeFirst();
        filafinal.removeFirst();

        //adicionando dois ultimos
        filafinal.addLast("Marcos");
        filafinal.addLast("Pedro");

        //mostrando a lista final
        System.out.print("Fila final: ");
        for (String nomes : filafinal){
            System.out.print(nomes+" ");
        }
        System.out.println();
        //mostrando lista inicial
        System.out.print("Fila inicial: ");
        for (String nomeinicial : fila){
            System.out.print(nomeinicial+" ");
        }

    }
}

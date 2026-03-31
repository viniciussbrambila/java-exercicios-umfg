package exercicio8;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        List<String> Cidades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String letra,vogal ="aeiou",consoante ="bcdfghjklmnpqrstvwxyz";
        boolean letraerrada = false;
        Cidades.add("Cianorte");
        Cidades.add("Maringá");
        Cidades.add("Diadema");
        Cidades.add("Cascavel");
        Cidades.add("Arapongas");
        Cidades.add("Pindamonhangaba");
        Cidades.add("Xique-Xique");
        Cidades.add("Santos");
        Cidades.add("Itapema");
        Cidades.add("Umuarama");

        System.out.println("Lista das 10 cidades do Brasil:"+"\n"+ Cidades);
        int vogalcont = 0;
        int consoantecont = 0;

        System.out.println("Digite uma letra para ver cidades que começam com ela:");
        letra = sc.nextLine();
        for (int i = 0;i < Cidades.size();i++){
            String nomecidade = Cidades.get(i);
            nomecidade = nomecidade.toLowerCase();
            char primeiraletra = nomecidade.charAt(0);
            if (vogal.indexOf(primeiraletra) != -1){
                vogalcont++;

            }else if (consoante.indexOf(primeiraletra) != -1){
                consoantecont++;
            }

            if (nomecidade.startsWith(letra)){
                System.out.println(nomecidade);

            }else {
                letraerrada = true;
            }
        }
        if (letraerrada == true) {
            System.out.println("Nenhuma cidade da lista começa com essa letra.");

        }
        System.out.println(vogalcont+ " cidades começam com vogais.");
        System.out.println(consoantecont+ " cidades começam com consoantes.");

    }
}

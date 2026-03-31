package exercicio2;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2,13,5,25,9};
        int[] array2 = {11,21,4,18,6};
        int recebesoma = produtoEscalar(array1,array2);
        System.out.println("O produto escalar é: "+recebesoma);


    }
    public static int produtoEscalar(int[] vetor1,int[]vetor2){

        int soma = 0;
        for (int i = 0;i < 5;i++){
            soma = soma + (vetor1[i] * vetor2[i]);
        }
        return soma;
    }

}

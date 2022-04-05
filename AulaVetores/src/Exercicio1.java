import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int soma =0;

        int vetor[] = new int[6];

        vetor[0] = 5;
        vetor[1] = 10;
        vetor[2] = 20;
        vetor[3] = 3;
        vetor[4] = 1;
        vetor[5] = 8;


        for(int i =0;i < vetor.length; i++){
            soma = soma + vetor[i];
            System.out.println("numero "+i+": "+vetor[i]);
            
        }
        System.out.println("Resultado :"+soma);
    }
}

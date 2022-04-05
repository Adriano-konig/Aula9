import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vetor[] = new int[10];
        int ListaNumeros;

        for(int i =0; i < vetor.length;i++){
            System.out.println("Digite numeros que deseja: ");
            int numero = leitor.nextInt();
            //numero = i + 1;
        //     if( vetor[i] %2==0){
        //         System.out.println("Numero par é: "+numero);
        //    }
        }
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = i + 1;
            if( vetor[i] %2==0){
                System.out.println("Numero par é: "+vetor[i]);
           }
        }
        }     
    }

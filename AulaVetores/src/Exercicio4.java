import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade itens desejar fazer compras: ");
        int numeroLista = leitor.nextInt();
        int vetor[] = new int[numeroLista];

        String ListaCompras[] = new String[numeroLista];

        for(int i = 0;i < vetor.length;i++){
            System.out.println("Lista "+i+": ");
            ListaCompras[i] = leitor.next();
        }

        for(int i = 0;i < vetor.length;i++){
            System.out.println("Lista de compras hoje é: "+ListaCompras[i]);
        }

    }
    
}

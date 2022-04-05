import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos nomes você inserir?: ");
        int NumerosLista = leitor.nextInt();

        String ListNomes[] = new String[NumerosLista];

        for(int i = 0; i < ListNomes.length; i++){
            System.out.println("Nome "+i+":");
            ListNomes[i] = leitor.next();
        }

        System.out.println("**************************************");
        System.out.println("             Lista Nomes              ");
        System.out.println("**************************************");

        for(int i = 0; i < ListNomes.length;i++){
            System.out.println("Lista nome "+i+": "+ListNomes[i]);
        }

    }
}

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String ListaMusica[] = new String[3];
        System.out.println("Inserir 3 nomes de musicas: ");
        for(int i = 0;i < ListaMusica.length;i++){
            System.out.println("Musica "+i+": ");
            ListaMusica[i] = leitor.next();
        }
        System.out.println("Nome da banda: ");

        for(int i = 0;i < ListaMusica.length;i++){
        System.out.println(ListaMusica[i]);
        }
    }
}

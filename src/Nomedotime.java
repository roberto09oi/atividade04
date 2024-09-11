import java.util.Scanner;
public class Nomedotime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] timeA = new String[5];
        String[] timeB = new String[5];

        // Coletar os nomes dos jogadores do time A
        System.out.println("Informe o nome dos jogadores do time A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + (i + 1) + ": ");
            timeA[i] = sc.next();
        }

        // Coletar os nomes dos jogadores do time B
        System.out.println("Informe o nome dos jogadores do time B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + (i + 1) + ": ");
            timeB[i] = sc.next();
        }

        // Exibir os nomes dos times
        System.out.println("\nJogadores do time A:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + timeA[i]);
        }

        System.out.println("\nJogadores do time B:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + timeB[i]);
        }

        sc.close();
    }
}
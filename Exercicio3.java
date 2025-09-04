import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        
        System.out.println("Digite 10 nomes:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        System.out.println("\nNomes no array:");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "] " + nomes[i]);
        }
        
        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeRemover = scanner.nextLine();
        
        boolean removido = false;
        
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                nomes[i] = "---";
                System.out.println("Nome '" + nomeRemover + "' removido da posição " + i);
                removido = true;
            }
        }
        
        if (!removido) {
            System.out.println("Nome '" + nomeRemover + "' não foi encontrado no array.");
        }
        
        System.out.println("\nArray após remoção:");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "] " + nomes[i]);
        }
        
        scanner.close();
    }
}
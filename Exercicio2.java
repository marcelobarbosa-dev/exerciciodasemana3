import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("\nDigite o número que deseja buscar: ");
        int numeroBusca = scanner.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroBusca) {
                System.out.println("O número " + numeroBusca + " foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("O número " + numeroBusca + " não foi encontrado no array.");
        }
        
        scanner.close();
    }
}
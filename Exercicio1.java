import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0, impares = 0;
        
        System.out.println("Digite 20 números inteiros:");
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("\nResultados:");
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        
        scanner.close();
    }
}
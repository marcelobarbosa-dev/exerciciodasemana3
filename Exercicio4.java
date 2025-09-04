import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nFrequência de cada número:");
        
        boolean[] jaContado = new boolean[10];
        
        for (int i = 0; i < 10; i++) {
            if (!jaContado[i]) {
                int contador = 1;
                
                for (int j = i + 1; j < 10; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                        jaContado[j] = true;
                    }
                }
                
                System.out.println("Número " + numeros[i] + " aparece " + contador + " vez(es)");
            }
        }
        
        scanner.close();
    }
}
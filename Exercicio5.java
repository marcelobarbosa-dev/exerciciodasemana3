import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        
        System.out.println("Digite os " + tamanho + " números:");
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nArray antes da ordenação:");
        mostrarArray(numeros);
        
        bubbleSort(numeros);
        
        System.out.println("\nArray após ordenação (Bubble Sort):");
        mostrarArray(numeros);
        
        scanner.close();
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean houveTroca = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    houveTroca = true;
                }
            }
            
            if (!houveTroca) {
                break;
            }
        }
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
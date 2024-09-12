import dados.BubbleSort;
import dados.SelectionSort;
import dados.InsertionSort;
import dados.QuickSort;
import dados.MergeSort;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("              UNIFAN - FACULDADE ALFREDO NASSER");
        System.out.println("Professor: Ricardo Vilaverde");
        System.out.println("Alunos: Bruno Custodio, Lucas Reis, Victor Fernandes");
        System.out.println("  ");
        System.out.println("                      SIMULADOR DE CARTAS    ");

        Scanner scanner = new Scanner(System.in);
        int[] cartas = new int[7];

        System.out.println("Digite os valores das cartas (7 valores):");
        for (int i = 0; i < 7; i++) {
            System.out.print("Carta " + (i + 1) + ": ");
            cartas[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1 - Valores das cartas");
            System.out.println("2 - Método BubbleSort");
            System.out.println("3 - Método SelectionSort");
            System.out.println("4 - Método InsertionSort");
            System.out.println("5 - Método QuickSort");
            System.out.println("6 - Método MergeSort");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) break;

            switch (escolha) {
                case 1:
                    System.out.print("Valores das cartas: ");
                    for (int valor : cartas) {
                        System.out.print(valor + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    BubbleSort.bubbleSort(cartas);
                    break;
                case 3:
                    SelectionSort.selectionSort(cartas);
                    break;
                case 4:
                    InsertionSort.insertionSort(cartas);
                    break;
                case 5:
                    QuickSort.quickSort(cartas, 0, cartas.length - 1);
                    break;
                case 6:
                    MergeSort.mergeSort(cartas, 0, cartas.length - 1);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }

        scanner.close();
    }
}

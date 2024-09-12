package dados;

public class SelectionSort {
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
            System.out.print("Passo " + (i + 1) + ": ");
            for (int k : vetor) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

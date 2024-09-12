package dados;

public class BubbleSort {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            System.out.print("Passo " + (i + 1) + ": ");
            for (int k : vetor) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

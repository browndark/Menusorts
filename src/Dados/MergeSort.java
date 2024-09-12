package dados;

public class MergeSort {
    public static void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);
            merge(vetor, esquerda, meio, direita);
        }
        System.out.print("Passo MergeSort: ");
        for (int k : vetor) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private static void merge(int[] vetor, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
        int[] esquerdaArray = new int[n1];
        int[] direitaArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            esquerdaArray[i] = vetor[esquerda + i];
        }
        for (int j = 0; j < n2; ++j) {
            direitaArray[j] = vetor[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (esquerdaArray[i] <= direitaArray[j]) {
                vetor[k] = esquerdaArray[i];
                i++;
            } else {
                vetor[k] = direitaArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = esquerdaArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = direitaArray[j];
            j++;
            k++;
        }
    }
}

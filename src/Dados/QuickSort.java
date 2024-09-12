package dados;

public class QuickSort {
    public static void quickSort(int[] vetor, int baixo, int alto) {
        if (baixo < alto) {
            int p = particionar(vetor, baixo, alto);
            quickSort(vetor, baixo, p - 1);
            quickSort(vetor, p + 1, alto);
        }
        System.out.print("Passo QuickSort: ");
        for (int k : vetor) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private static int particionar(int[] vetor, int baixo, int alto) {
        int pivo = vetor[alto];
        int i = (baixo - 1);
        for (int j = baixo; j < alto; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[alto];
        vetor[alto] = temp;
        return i + 1;
    }
}

package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do vetor:");
        int n = entrada.nextInt();
        int vetor[] = preencheVetor(n); 
        System.out.println("Antes: " + Arrays.toString(vetor));
        ordenar(vetor, n);
        System.out.println("Depois:  " + Arrays.toString(vetor));
        entrada.close();
    }

    public static int[] ordenar(int[] a, int k) {
        int c[] = new int[k];
        for (int i = 0; i < a.length; i++)
            c[a[i]]++;
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        int b[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--)
            b[--c[a[i]]] = a[i];
        return b;
    }
    
        private static int[] preencheVetor(int n){
        int vetor[] = new int[n];
        Random gerar = new Random();
        for(int i = 0; i < n; i++){
            vetor[i] = gerar.nextInt(n);
        }
                
        return vetor;
    }
    
}
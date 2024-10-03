package com.example.universidadeESN3.controller;

public class InsertionSort {
    import java.util.Scanner;

    public class InsertionSortApp {

        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                // Move os elementos que são maiores que a chave, para uma posição à frente de sua posição atual
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;

                // Exibindo o vetor após cada iteração
                System.out.println("Interação " + i + ": ");
                printArray(arr);
            }
        }

        // Método para imprimir o vetor
        public static void printArray(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitando o tamanho do vetor
            System.out.print("Informe o tamanho do vetor: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            // Inserindo valores no vetor
            for (int i = 0; i < size; i++) {
                System.out.print("Informe o valor para a posição " + i + ": ");
                arr[i] = scanner.nextInt();
            }

            // Exibindo o vetor original
            System.out.println("Vetor original:");
            printArray(arr);

            // Ordenando usando InsertionSort
            System.out.println("Iniciando InsertionSort:");
            insertionSort(arr);

            // Exibindo o vetor ordenado
            System.out.println("Vetor ordenado:");
            printArray(arr);
        }
    }

}

package control;

import java.util.ArrayList;
import java.util.List;

public class Main2Control {
    public int[][] gerarMatrizCompleta(int n) {
        int[][] matrizAdj = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) matrizAdj[i][j] = 1;
            }
        }

        return matrizAdj;
    }

    public void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }

            System.out.println();
        }
    }

    public List<List<Integer>> gerarListaCompleta(int n) {
        List<List<Integer>> listaAdj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> vizinhos = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (i != j) vizinhos.add(j);
            }

            listaAdj.add(vizinhos);
        }
        return listaAdj;
    }

    public void exibirListaAdjacencia(List<List<Integer>> listaAdj) {
        for (int i = 0; i < listaAdj.size(); i++) {
            System.out.print(i + ": ");

            for (int vizinho : listaAdj.get(i)) {
                System.out.print(vizinho + " ");
            }

            System.out.println("");
        }
    }
}

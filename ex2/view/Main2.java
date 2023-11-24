package view;

import control.Main2Control;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Main2Control control = new Main2Control();

        int n = 5;
        System.out.println("(n) Número de vértices : "+n);

        System.out.println("\nMatriz de Adjacência:");
        int[][] matrizAdj = control.gerarMatrizCompleta(n);
        control.exibirMatriz(matrizAdj);

        System.out.println("\nLista de Adjacências:");
        List<List<Integer>> listaAdj = control.gerarListaCompleta(n);
        control.exibirListaAdjacencia(listaAdj);
    }
}
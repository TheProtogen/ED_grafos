package view;

import control.Main3Control;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Main3Control control = new Main3Control();
        int[][] grafo = new int[5][5];
        Random random = new Random();

        for (int x = 0; x < grafo.length; x++) {
            for (int y = 0; y < grafo.length; y++) {
                if (x > y) grafo[x][y] = grafo[y][x] = random.nextInt(5);
            }
        }

        control.exibirArestas(grafo);
    }
}

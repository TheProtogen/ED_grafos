package control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main4Control {

    private int[][] preencherMatriz() throws IOException {
        int[][] matriz;
        BufferedReader leitor = new BufferedReader(new FileReader("ex4\\file.txt"));

        String linhaArquivo = leitor.readLine();
        int tamanho = Integer.parseInt(linhaArquivo);
        matriz = new int[tamanho][tamanho];

        int linhaMatriz = 0;
        while ((linhaArquivo = leitor.readLine()) != null) {
            String[] colunas = linhaArquivo.split(" ");

            for (int y = 0; y < colunas.length; y++) {
                matriz[linhaMatriz][y] = Integer.parseInt(colunas[y]);
            }

            linhaMatriz++;
        }

        return matriz;
    }

    public int[][] preencherTrianguloSuperior() throws IOException {
        int[][] grafo = preencherMatriz();
        int tamanho = grafo.length;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (valorNoTrianguloInferior(x, y)) grafo[y][x] = grafo[x][y];
            }
        }

        return grafo;
    }

    private boolean valorNoTrianguloInferior(int linha, int coluna) {
        return linha > coluna;
    }

    public void exibirMatriz(int[][] matriz) {
        int tamanho = matriz.length;

        for (int[] ints : matriz) {
            for (int y = 0; y < tamanho; y++) {
                System.out.print(ints[y] + " ");
            }

            System.out.println();
        }
    }
}

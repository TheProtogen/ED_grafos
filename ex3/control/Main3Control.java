package control;

public class Main3Control {
    public void exibirArestas(int[][] grafo) {
        exibirMatriz(grafo);

        for (int x = 0; x < grafo.length; x++) {
            for (int y = 0; y < grafo.length; y++) {
                if (grafo[x][y] != 0)
                    System.out.println("Aresta[" + x + "," + y + "] = peso[" + grafo[x][y] + "]");
            }
        }
    }

    public void exibirMatriz(int[][] grafo) {
        for (int x = 0; x < grafo.length; x++) {
            for (int y = 0; y < grafo.length; y++) {
                System.out.print(grafo[x][y] + " ");
            }
            System.out.println();
        }
    }
}

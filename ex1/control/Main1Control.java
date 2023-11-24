package control;

import java.util.ArrayList;

public class Main1Control {
    public void imprimirArestas(int[][] matrizAdj) {
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = i + 1; j < matrizAdj.length; j++) {
                if (matrizAdj[i][j] == 1) {
                    System.out.println("Aresta: (" + i + ", " + j + ")");
                }
            }
        }
    }

    // Função para verificar se o grafo é um dígrafo
    public String ehDigrafo(int[][] matrizAdj) {
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                if (matrizAdj[i][j] != matrizAdj[j][i]) return "É um dígrafo."; // Se houver uma aresta em uma direção e não na outra, é um dígrafo
            }
        }

        return "É um grafo não-direcionado."; // Se todas as arestas forem simétricas, é um grafo não-direcionado
    }

    // Função para calcular o grau de cada vértice
    public int[] calcularGraus(int[][] matrizAdj) {
        int[] graus = new int[matrizAdj.length];

        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                graus[i] += matrizAdj[i][j];
            }
        }

        return graus;
    }

    // Função para imprimir os graus de cada vértice
    public void imprimirGraus(int[] graus) {
        for (int i = 0; i < graus.length; i++) {
            System.out.println("Vértice " + i + ": Grau " + graus[i]);
        }
    }

    //verifica se o grafo é conexo
    public String conexoOuDesconexo(int[][] grafo) {
        int i;

        for (i = 0; i < grafo.length; i++) {
            if (todasLinhasEColunasZeradas(grafo, i))
                return "O grafo é desconexo por causa do " + (i + 1) + "º vértice.";
        }

        return "O grafo é conexo";
    }

    private boolean todasLinhasEColunasZeradas(int[][] grafo, int vertice) {
        //verifica a linha correspondente ao vértice
        for (int i = 0; i < grafo.length; i++) {
            if (grafo[vertice][i] != 0) {
                //se encontrar um elemento diferente de zero, o vértice é conexo
                return false;
            }
        }

        //verifica a coluna correspondente ao vértice
        for (int[] ints : grafo) {
            if (ints[vertice] != 0) {
                //se encontrar um elemento diferente de zero, o vértice é conexo
                return false;
            }
        }

        //se tudo passar, o vértice é desconexo
        return true;
    }

    //verifica se o grafo é cíclico
    public boolean ehCiclico(int[][] matrizAdj) {
        //verifica se há um ciclo em qualquer vértice
        for (int i = 0; i < matrizAdj.length; i++) {
            boolean[] visitados = new boolean[matrizAdj.length];
            if (dfsCiclico(matrizAdj, i, -1, visitados)) return true;
        }

        return false;
    }

    //realizar uma busca em profundidade, verifica se há um ciclo
    public boolean dfsCiclico(int[][] matrizAdj, int vertice, int pai, boolean[] visitados) {
        visitados[vertice] = true;

        for (int vizinho = 0; vizinho < matrizAdj.length; vizinho++) {
            if (matrizAdj[vertice][vizinho] == 1) {

                if (!visitados[vizinho]) {
                    if (dfsCiclico(matrizAdj, vizinho, vertice, visitados)) return true;
                } else if (vizinho != pai) return true; //ciclo localizado

            }
        }

        return false;
    }

    // Função para imprimir a lista de adjacências
    public void imprimirListaAdjacencias(int[][] matrizAdj) {
        for (int i = 0; i < matrizAdj.length; i++) {
            ArrayList<Integer> vizinhos = new ArrayList<>();

            for (int j = 0; j < matrizAdj.length; j++) {
                if (matrizAdj[i][j] == 1) vizinhos.add(j);
            }

            System.out.println("Vértice " + i + ": " + vizinhos);
        }
    }
}

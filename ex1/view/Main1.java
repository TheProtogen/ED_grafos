package view;

import control.Main1Control;


public class Main1 {

    public static void main(String[] args) {
        Main1Control control = new Main1Control();

        int[][] matrizAdj = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0},
        };

        // Responde às perguntas
        System.out.println("a) Arestas do grafo:");
        control.imprimirArestas(matrizAdj);

        System.out.println("\nb) O grafo é direcionado (dígrafo) ou não-direcionado?");
        System.out.println(control.ehDigrafo(matrizAdj));

        System.out.println("\nc) Grau de cada vértice:");
        int[] graus = control.calcularGraus(matrizAdj);
        control.imprimirGraus(graus);

        System.out.println("\nd) O grafo é conexo?");
        System.out.println(control.conexoOuDesconexo(matrizAdj));

        System.out.println("\ne) O grafo é cíclico ou acíclico?");
        if (control.ehCiclico(matrizAdj)) {
            System.out.println("O grafo é cíclico.");
        } else {
            System.out.println("O grafo é acíclico.");
        }

        System.out.println("\nf) Lista de adjacências:");
        control.imprimirListaAdjacencias(matrizAdj);


    }
}
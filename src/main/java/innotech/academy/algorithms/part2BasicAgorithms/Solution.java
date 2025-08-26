package innotech.academy.algorithms.part2BasicAgorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * К данному заданию приложена схема сети маршрутизаторов/серверов, обменивающихся сетевым трафиком.
 * <p>
 * Если между двумя узлами сети есть связь, они соединены ребром. Для каждого ребра указана номинальная пропускная способность среды и процент потерянных пакетов во время передачи.
 * <p>
 * Необходимо выразить данную схему в двух формах: с использованием массива и с использованием узлов.
 * <p>
 * Код обоих вариантов решения задачи необходимо прикрепить к ответу.
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.networkPseudoMatrix();
        System.out.println();
        solution.networkTrueMatrix();
        System.out.println();
        solution.networkAdjacencyList();
    }

    private void networkPseudoMatrix() {
        // Узлы: A=0, B=1, C=2, D=3, E=4, F=5
        Edge[][] networkMatrix = new Edge[6][6];

        networkMatrix[0][1] = new Edge(1500, 90);  // A -> B
        networkMatrix[0][2] = new Edge(2000, 10);  // A -> C
        networkMatrix[0][3] = new Edge(1000, 50);  // A -> D
        networkMatrix[1][5] = new Edge(1500, 60);  // B -> F
        networkMatrix[2][4] = new Edge(900, 5);    // C -> E
        networkMatrix[2][5] = new Edge(500, 20);   // C -> F
        networkMatrix[3][4] = new Edge(2500, 1);   // D -> E
        networkMatrix[4][5] = new Edge(300, 85);   // E -> F

        System.out.println("Матрица смежности (A=0, B=1, C=2, D=3, E=4, F=5):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%-10s ", networkMatrix[i][j] != null ? networkMatrix[i][j] : "null");
            System.out.println();
        }
    }

    private void networkTrueMatrix() {
        // Узлы: A=0, B=1, C=2, D=3, E=4, F=5
        TrueTwoDimensionalArray trueTwoDimensionalArray = new TrueTwoDimensionalArray(6, 6);

        trueTwoDimensionalArray.set(0, 1, new Edge(1500, 90));  // A -> B
        trueTwoDimensionalArray.set(0, 2, new Edge(2000, 10));  // A -> C
        trueTwoDimensionalArray.set(0, 3, new Edge(1000, 50));  // A -> D
        trueTwoDimensionalArray.set(1, 5, new Edge(1500, 60));  // B -> F
        trueTwoDimensionalArray.set(2, 4, new Edge(900, 5));    // C -> E
        trueTwoDimensionalArray.set(2, 5, new Edge(500, 20));   // C -> F
        trueTwoDimensionalArray.set(3, 4, new Edge(2500, 1));   // D -> E
        trueTwoDimensionalArray.set(4, 5, new Edge(300, 85));   // E -> F

        System.out.println("Матрица смежности настоящего двумерного массива (A=0, B=1, C=2, D=3, E=4, F=5):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%-10s ", trueTwoDimensionalArray.get(i, j) != null ?
                        trueTwoDimensionalArray.get(i, j) : "null");
            System.out.println();
        }
    }


    private void networkAdjacencyList() {
        // Список смежности: узел -> Map(сосед -> Edge)
        Map<Character, Map<Character, Edge>> network = new HashMap<>();

        char[] nodes = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char node : nodes)
            network.put(node, new HashMap<>());

        network.get('A').put('B', new Edge(1500, 90));
        network.get('A').put('C', new Edge(2000, 10));
        network.get('A').put('D', new Edge(1000, 50));
        network.get('B').put('F', new Edge(1500, 60));
        network.get('C').put('E', new Edge(900, 5));
        network.get('C').put('F', new Edge(500, 20));
        network.get('D').put('E', new Edge(2500, 1));
        network.get('E').put('F', new Edge(300, 85));

        System.out.println("Список смежности:");
        for (char node : nodes) {
            System.out.print(node + ": ");
            if (network.get(node).isEmpty())
                System.out.println("{}");
            else
                System.out.println(network.get(node));
        }
    }
}
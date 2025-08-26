package innotech.academy.algorithms.part3ComplexityOfAlgorithms;

class Part3Solution {

    public Pair findMinMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Массив не должен быть пустым");

        int globalMin, globalMax;
        int startIndex;
        int comparisons = 0; // Счётчик сравнений

        if (arr.length % 2 == 1) {// Если длина нечётная
            globalMin = arr[0];
            globalMax = arr[0];
            startIndex = 1;
        } else {
            if (arr[0] <= arr[1]) {
                globalMin = arr[0];
                globalMax = arr[1];
            } else {
                globalMin = arr[1];
                globalMax = arr[0];
            }
            comparisons++; // + Первое сравнение для пары
            startIndex = 2;
        }

        for (int i = startIndex; i < arr.length - 1; i += 2) {
            var current = arr[i];
            var next = arr[i + 1];

            int localMin, localMax;

            comparisons++; // + Сравнение a и b
            if (current <= next) {
                localMin = current;
                localMax = next;
            } else {
                localMin = next;
                localMax = current;
            }

            if (localMin < globalMin) globalMin = localMin;
            comparisons++; // + Сравнение с min

            if (localMax > globalMax) globalMax = localMax;
            comparisons++; // + Сравнение с max
        }
        return new Pair(globalMin, globalMax, comparisons);
    }
}
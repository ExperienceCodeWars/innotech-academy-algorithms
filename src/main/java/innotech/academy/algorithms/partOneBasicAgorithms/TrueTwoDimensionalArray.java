package innotech.academy.algorithms.partOneBasicAgorithms;

/**
 * Настоящий двумерный массив.
 */
public class TrueTwoDimensionalArray {
    Edge[] arrayData;
    int height;

    public TrueTwoDimensionalArray(int height, int length) {
        arrayData = new Edge[height * length];
        this.height = height;
    }

    public Edge get(int i, int j) {
        return arrayData[i * height + j];
    }

    public void set(int i, int j, Edge value) {
        arrayData[i * height + j] = value;
    }
}
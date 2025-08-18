package innotech.academy.algorithms.partOneBasicAgorithms;

public record Edge(
        int bandwidth,   // пропускная способность
        int lossPercent // процент потерь
) {
    @Override
    public String toString() {
        return "(" + bandwidth + ", " + lossPercent + ")";
    }
}
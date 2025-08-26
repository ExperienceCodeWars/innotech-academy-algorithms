package innotech.academy.algorithms.part2BasicAgorithms;

public record Edge(
        int bandwidth,   // пропускная способность
        int lossPercent // процент потерь
) {
    @Override
    public String toString() {
        return "(" + bandwidth + ", " + lossPercent + ")";
    }
}
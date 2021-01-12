import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int total = IntStream.range(1, input+1).sum();

        return total * total;
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(1, input+1)
                        .map(i -> i*i)
                        .sum();
    }

    int computeDifferenceOfSquares(int input) {
        int squareOfSums = computeSquareOfSumTo(input);
        int sumOfSquares = computeSumOfSquaresTo(input);

        return Math.abs(squareOfSums - sumOfSquares);
    }

}

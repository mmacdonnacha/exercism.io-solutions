import java.util.stream.IntStream;

class Hamming {

    private String left;
    private String right;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.left = leftStrand;
        this.right = rightStrand;
    }

    int getHammingDistance() {
        return (int)IntStream.range(0, right.length())
            .filter(i -> left.charAt(i) != right.charAt(i))
            .count();
    }

} 
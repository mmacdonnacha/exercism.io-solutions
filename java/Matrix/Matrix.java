import java.util.Arrays;

class Matrix {

    int[][] matrix;

    Matrix(String matrixAsString) {
        matrix = createMatrix(matrixAsString);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[matrix.length];

        for(int i=0; i<matrix.length; i++){
            col[i] = matrix[i][columnNumber-1];
        }

        return col;
    }

    int[][] createMatrix(String matrixAsString){
        return Arrays.stream(matrixAsString.split("\n"))
                     .map(line -> Arrays.stream(line.split(" "))
                                        .mapToInt(Integer::valueOf)
                                        .toArray()
                     ).toArray(int[][]::new);
    }
}

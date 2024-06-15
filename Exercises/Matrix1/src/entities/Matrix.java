package entities;

public class Matrix {
    private int x;
    private int[][] matrix;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static boolean verify(int[][] matrix, int x) {
        int i, j;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[i].length; j++) {
                if(x != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

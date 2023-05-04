class Matematika {
    // fungsi untuk menghitung determinan matriks 3x3
    public static int calculateDeterminant(int[][] matrix) {
        int determinant = 0;
        int row1 = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]));
        int row2 = matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]));
        int row3 = matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
        determinant = row1 - row2 + row3;
        return determinant;
    }
}
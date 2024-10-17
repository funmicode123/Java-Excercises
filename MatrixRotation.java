public class MatrixRotation {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate90Clockwise(matrix);

        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }

    public static void rotate90Clockwise(int[][] matrix) {
        int length = matrix.length;

        for (int row = 0; row < length; row++) {
            for (int column = row; column < length; column++) {
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
        }

 
        for (int index = 0; index < length; index++) {
            reverseRow(matrix[index]);
        }
    }

 
    private static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    
}

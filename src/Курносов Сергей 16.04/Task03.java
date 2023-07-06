package homework;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        System.out.println("↓ Первый способ ↓");
        printMatrix(matrix);
        System.out.println();
        System.out.println("↓ Второй способ ↓");
        printMatrixTwo(matrix);
    }

    //----------------------------------------------------------
    // Первый способ
    private static void printMatrix(int[][] matrix) {
        int count = 0;
        int middle = matrix.length / 2;
        int dif = 0;
        for (int i = 0; i < matrix.length; i++) {
            dif = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i >= 2) {
                    dif = middle + count;
                    if (j == dif) {
                        for (int k = middle + count; k <= middle - count; k++) {
                            matrix[i][j] = 1;
                            System.out.print(matrix[i][j] + " ");
                            j = k;
                        }
                        count--;
                    } else {
                        matrix[i][j] = 0;
                        System.out.print(matrix[i][j] + " ");
                    }

                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //-----------------------------------------------------------
    //Второй способ (немного попроще , код сокращен на 1/4 )
    private static void printMatrixTwo(int[][] matrix) {
        int middle = 2;
        int variable = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= 2) {
                    if (j >= middle - variable && j <= middle + variable) {
                        matrix[i][j] = 1;
                        System.out.print(matrix[i][j] + " ");
                    } else {
                        matrix[i][j] = 0;
                        System.out.print(matrix[i][j] + " ");
                    }
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
            if (i >= 2) {
                variable++;
            }
        }
    }
}
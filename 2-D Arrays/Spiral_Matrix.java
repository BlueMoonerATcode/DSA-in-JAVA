import java.util.*;

public class Spiral_Matrix {

    public static void spiral(int matrix[][]) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            // Top
            for (int j = sr; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }

            // Right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }

            // Bottom
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                System.out.print(matrix[er][j] + " ");

            }

            // Left
            for (int i = er - 1; i >= sr + 1; i--) {

                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[i][sc] + " ");
            }

            sr++;
            er--;
            sc++;
            ec--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiral(matrix);

    }
}

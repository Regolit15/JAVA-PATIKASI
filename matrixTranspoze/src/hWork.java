public class hWork {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        int tranpose[][] = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix' in Transpozesi : ");
        for (int i = 0; i < matrix.length + 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                tranpose[i][j] = matrix[j][i];
                System.out.print(tranpose[i][j] + " ");


            }
            System.out.println();
        }

    }
}

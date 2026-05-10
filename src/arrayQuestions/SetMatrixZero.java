package arrayQuestions;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRowZero = false;
        boolean isColumnZero = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0) isRowZero = true;
                    if(j == 0) isColumnZero = true;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
               if(matrix[i][0] == 0 || matrix[0][j] == 0){
                   matrix[i][j] = 0;
               }
            }
        }
        if(isRowZero){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(isColumnZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        for(int [] val : matrix){
            for(int ans : val) {
                System.out.print(ans+" ");
            }
            System.out.println();
        }

    }
}

package arrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0 ;
        int sc = 0;
        int ec = n-1;
        int er = m-1;
        List<Integer> list = new ArrayList<>();
        int count = n*m ;
        while(count > 0){
            for (int i = sc ; i <= ec; i++){
                list.add(matrix[sr][i]);
                count --;
            }
            sr ++;
            if (count == 0) break;
            for (int i = sr; i <= er; i++){
                    list.add(matrix[i][ec]);
                    count --;
            }
            ec --;
            if (count == 0) break;
            for (int i = ec; i >= sc; i--){
                list.add(matrix[er][i]);
                count --;
            }
            er --;
            if (count == 0) break;
            for (int i = er; i >= sr; i--){
                    list.add(matrix[i][sc]);
                    count --;
            }
            sc ++;
            if (count == 0) break;
        }
        System.out.println(list);
    }
}

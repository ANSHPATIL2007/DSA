package arrayQuestions;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][] arr2= new int [arr[0].length][arr.length];
        for (int i = 0 ; i<arr.length; i++){
            for (int j = 0 ; j<arr[0].length; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        for (int []var : arr2){
            for  (int var2 : var){
                System.out.print(var2 + " ");
            }
            System.out.println();
        }
    }
}

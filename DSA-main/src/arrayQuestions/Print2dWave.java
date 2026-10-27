package arrayQuestions;

public class Print2dWave {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int i = 0;
        while(i<=arr[0].length-1){
            if (i%2==0){
                for(int j = 0; j<arr.length;j++){
                    System.out.println(arr[j][i]);
                }
            }
            else{
                for(int j = arr.length-1; j>0;j--){
                    System.out.println(arr[j][i]);
                }
            }
            i++;
        }
    }
}

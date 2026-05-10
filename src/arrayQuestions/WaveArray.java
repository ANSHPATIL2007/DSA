package arrayQuestions;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i+=2) {
            if ( i == arr.length-1) break ;
            int temp  = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int var : arr){
            System.out.print(var + " ");
        }
    }
}

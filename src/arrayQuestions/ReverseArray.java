package arrayQuestions;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {-1 , 8 , 14, 0, -1 , 23,47,4 ,3};
        int j = arr.length-1;

        for (int i = 0; i <= arr.length-1 ; i++) {

            if (i < j){
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for  (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

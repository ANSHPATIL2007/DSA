package arrayQuestions;

public class SearchinArray {
    public static void main(String[] args) {

        int[] arr = {-1 , 8 , 14, 0, -1 , 23,47,4 ,3};
        int x = 8 ;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == x)System.out.println(i);
        }
    }
}

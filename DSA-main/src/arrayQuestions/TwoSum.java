package arrayQuestions;

import java.util.Arrays ;
public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {-1 , 8 , 14, 0, -1 , 23,47,4 ,3};
        Arrays.sort(arr);
        int target = 13 ;
        int j = arr.length-1 ;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]+arr[j] == target){
                System.out.println("Target found"+i +"and" +j);
                break;
            }

        }
    }
}

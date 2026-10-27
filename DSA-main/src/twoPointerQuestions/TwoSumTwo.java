package twoPointerQuestions;

public class TwoSumTwo {
    static void main() {

         int[] arr = {1,2,4,7,11,15,};
         int target = 9;
         int i = 0;
         int j = arr.length-1;
         while(j>i) {
             int sum = arr[i]+arr[j];
             if(sum==target) {
                 System.out.println("element found ");
                 break;
             }
             else if(sum>target) {
                 j--;
             }
             else i++;

         }
    }
}

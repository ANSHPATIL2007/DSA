package arrayQuestions;

import java.util.ArrayList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {5,6,7};
        int[] arr1 = {3,4,4,6};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int carry  = 0 ;
        int i = arr.length -1 ;
        int j = arr1.length -1 ;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += arr[i--];
            }
            if(j>=0){
                sum += arr1[j--];
            }
            list.addFirst(sum%10);
            carry = sum/10;


        }
        if(carry > 0){
            list.add(carry);
        }
        System.out.println(list);
    }
}

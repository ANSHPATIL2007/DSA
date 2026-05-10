package arrayQuestions;

import java.util.ArrayList ;
public class addOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0 ;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 9 ) {
                if(arr[i]+carry > 9) list.add(0);
                carry = 1;
            }
            else {
                list.add(arr[i]+carry);
                carry = 0;
            }
        }
        System.out.println(list);
    }
}

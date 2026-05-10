package arrayQuestions;

import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args) {

        int[] arr = {10,19,20,30,40,40,40,50};
        int[] arr1 = {15,16,17,18,20,25,30,30,40};
        ArrayList<Integer> list = new ArrayList <Integer>();
        int a =  0;
        int b = 0;
        while(a<=arr.length-1 && b<=arr1.length-1){
            if(arr[a]==arr1[b]){
                list.add(arr[a]);
                a++;
                b++;
            }
            else if(arr[a]<arr1[b]){
                a++;
            }
            else b++;
        }
        System.out.printf("Intersection of Array:"+list);
    }
}

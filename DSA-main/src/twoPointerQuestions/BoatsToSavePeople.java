package twoPointerQuestions;

public class BoatsToSavePeople {
    static void main() {

        int[] arr = {1,2,2,3};
        int limit = 3;

        int j = arr.length-1;
        int i = 0;
        int boats = 0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum > limit){
                boats++;
                j--;
            }
            else i++;
        }
        System.out.println(boats+1);
    }
}

package twoPointerQuestions;

public class ZerosAndOnes {
    public static void main(String[] args) {

        int[] arr = {0,1,1,1,0,1,0,0,1};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        for(int x : arr){
        System.out.print(x+" ");}
    }
}

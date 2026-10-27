package twoPointerQuestions;

public class NextPermutation {
    static void main() {

        int [] arr = {1,5,8,4,7,6,5,3,1};

        int i = arr.length-2;
        while(i >=0 && arr[i+1]<=arr[i]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse (int [] nums, int start){
        int i = start,j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}

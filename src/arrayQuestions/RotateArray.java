package arrayQuestions;

public class RotateArray {
    //rotate array right and left
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        int d = 2 ;
        int k = d%array.length ;
        int m = array.length - (d%array.length);
        rev(array , 0 , m-1);
        rev(array , m , array.length-1);
        rev(array , 0 , array.length-1);
        for(int val : array){
            System.out.print(val);
        }
    }
    public static void rev(int[] nums, int i , int j ) {
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

package twoPointerQuestions;

public class RemoveDuplicates {
    static void main() {
        int [] nums = {0,0,1,1,1,2,2,3,3,4,4,5};
        int idx =1;
        for(int i =1; i < nums.length; i++ ){

            if(nums[i-1] != nums[i]){
                nums[idx] = nums[i];
                idx++;
            }
        }
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}

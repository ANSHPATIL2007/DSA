package arrayQuestions;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9};
        int[] arr1 = {1,3,4,5,7,8};
        int[] c = new int[arr.length+arr1.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<=arr1[j]){
                c[k++] = arr[i++];
            }
            else c[k++] = arr1[j++];
        }
        if(i==arr.length){
            c[k++] = arr1[j++];
        }
        else c[k++] = arr[i++];
        for(int var : c){
            System.out.print(var + " ");
        }
    }
}

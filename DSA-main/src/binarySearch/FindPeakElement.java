package binarySearch;

public class FindPeakElement {

    static void main() {

        int[] arr = {1,2,3,1};
        int low = 0;
        int high = arr.length-1;
        int ans = 0;
        while(low < high ){
            int mid = low + (high - low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }else if(arr[mid]>arr[mid+1]){
                high = mid-1;
            }
            ans = mid;
        }
        System.out.println(ans);
    }
}

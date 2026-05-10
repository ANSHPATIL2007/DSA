package arrayQuestions;

public class SortedSearch {
    //Search in Rotated Array
    public static void main(String[] args) {
        int [] Array = {5,6,7,8,9,1,2,3,4} ;
        int key = 4;
        int pivot = getPivot(Array , 0 , Array.length-1);
        int e = bs(Array , 0 , pivot  ,key );
        if (e==-1){
            e = bs(Array , pivot+1 , Array.length-1,key );
        }

        System.out.println("the element found at " +(e+1));
    }
    public static int getPivot(int[] arr ,int l , int r) {
        while(l<=r){
            int mid = (l+r)/2 ;
            if (mid<r&&arr[mid]>arr[mid+1]){
                return mid ;
            }
            else if (arr[mid]<arr[mid-1]){
                return mid-1 ;
            }
            else if (arr[mid]>arr[l]){
                l=mid+1 ;
            }
            else {
                r=mid-1 ;
            }
        }
        return 0 ;
    }
    public static int bs(int [] arr ,int i ,int j ,int e) {

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == e) {
                return mid;
            } else if (arr[mid] > e) {
                j = mid - 1;
            } else {
                i = mid + 1;

            }
        }
        return -1;
    }
}

package binarySearch;

public class VeryEasyTask {

    static void main() {

        System.out.println(time(4,1,1));
    }

    static int time(int n, int x, int y){

        if(n == 1){
            return Math.min(x,y);
        }
        int low = 0;
        int high = Math.max(x, y) * n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(good(n, x, y, mid)){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans + Math.min(x,y) ;
    }
    static boolean good(int n, int x, int y ,int mid) {
        return (mid/x) + (mid/y) >= n-1;
    }
}

package recurrsion;

public class HouseRobber {
    static void main() {

        int[] arr = {3, 1, 1, 9};
        System.out.println(MaxProfit(arr,0));
    }
    static int MaxProfit(int[] arr, int idx) {
        if(idx >= arr.length) return 0;
        return Math.max(arr[idx]+MaxProfit(arr, idx+2),MaxProfit(arr, idx+1));

    }
}

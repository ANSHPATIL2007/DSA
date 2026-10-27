package binarySearch;

public class SquareRoot {

    static void main() {

        System.out.println(square(225));
    }
    static int square(int x){

        int low = 0;
        int high = 16;

        while(low <= high){
            int mid = low + (high-low)/2;
            int sq = mid * mid;
            if(sq == x) return mid;
            else if(sq > x) high = mid -1;
            else low = mid + 1;
        }
        return -1;

    }
}

package arrayQuestions;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int n = arr.length+1;
        long sum = 0 ;
        long sumn = n*(n+1)/2;
        for (int i = 0; i <= arr.length-1 ; i++) sum += arr[i];
        System.out.println(sumn-sum);

    }
}

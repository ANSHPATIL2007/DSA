package arrayQuestions;

public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = {-1 , 8 , 14, 0, -1 , 23,47,4 ,3};
        int max = Integer.MIN_VALUE;
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];

            }
        }
        System.out.println(maximum);
    }/*deep copy
    impor*/
}

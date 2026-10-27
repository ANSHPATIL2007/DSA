package arrayQuestions;

public class Secondlargest {
    public static void main(String[] args) {

        int[] arr = {-1 , 8 , 14, 0, -1 , 23,47,4 ,3 } ;
        int max = Integer.MIN_VALUE;
        int secMax = arr[0] ;
        for (int i = 0; i<arr.length; i++){
           if (arr[i] > max){
               max = arr[i] ;
           }
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i] > secMax && arr[i]!=max ){
                secMax = arr[i] ;
            }
        }
        System.out.println(secMax);
    }
}

package arrayQuestions;

public class MultiandAdd {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for (int i = 0 ; i<arr.length ; i+=2){
            arr[i] +=10 ;
        }
        for (int i = 1 ; i<arr.length ; i+=2){
            arr[i] *=2 ;
        }
        for(int var : arr){
            System.out.print(var + " ");
        }
    }
}

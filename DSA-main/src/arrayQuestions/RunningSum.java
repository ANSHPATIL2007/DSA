package arrayQuestions;

public class RunningSum {
    public static void main(String[] args) {

        int [] Array = {5,6,7,8,9,1,2,3,4};
        int sum = 0 ;
        int [] Arr = new int[Array.length];
        for(int i=0;i<Array.length;i++){
            sum += Array[i];
            Arr[i] = sum;
        }
        for (int var : Arr){
            System.out.print(var + " ");
        }

    }
}

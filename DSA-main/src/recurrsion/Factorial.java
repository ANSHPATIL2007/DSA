package recurrsion;

public class Factorial {
    static void main() {
        System.out.println(Fact(5));
    }
    static int Fact(int n ){
        //base case
        if(n==1){
            return 1;
        }
        //assumption
        return n*Fact(n-1);
    }
}

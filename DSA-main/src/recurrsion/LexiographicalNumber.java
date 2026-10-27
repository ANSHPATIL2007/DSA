package recurrsion;

public class LexiographicalNumber {
    public static void f(int i , int n , String Result ){

        if(i <= n) {
            if(i != 0) Result += i ;
            else return ;
        }

        for(int k = 0; k <= 9; k++){
            if(i == 0 && k == 0) continue;
            f(10 * i + k, n, Result);

        }

    }

    static void main() {

        f(0,9, "");
    }
}

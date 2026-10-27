package recurrsion;

public class Fibonnaci {

    static void main() {

        System.out.println(fibbonaci(5));
    }
    static int fibbonaci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
}

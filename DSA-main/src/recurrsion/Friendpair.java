package recurrsion;

public class Friendpair {
    static void main() {

        System.out.println(f(4));
    }
    static int f(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return f(n-1)+f(n-2)*(n-1);
    }
}

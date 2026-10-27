package recurrsion;

public class BoardAndTile {
    static void main() {
        System.out.println(f(5));

    }
    static int f(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return f(n-1)+f(n-2);
    }
}

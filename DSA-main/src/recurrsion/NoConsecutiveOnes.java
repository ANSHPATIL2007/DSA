package recurrsion;

public class NoConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(f(7));
    }
    public static int f(int n) {
        if(n == 1) return 2;
        if(n == 2) return 3;
        return f(n - 1) + f(n - 2);
    }
}

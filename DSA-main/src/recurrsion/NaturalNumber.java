package recurrsion;

public class NaturalNumber {
    static void main() {
        natural(5);
    }
    static void natural (int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        natural(n-1);
        System.out.println(n);
        return;
    }
}

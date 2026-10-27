package recurrsion;

public class MazePath {
    static void main() {
        int m =3;
        int n=3;
        f(0,0,m,n,"");

    }
    static void f(int i , int j, int m , int n , String output){
        if(i == m - 1 && j == n - 1){
            System.out.println(output);
            return;
        }
        if(i >= m || j >= n){
            return;
        }
        f(i+1,j ,m ,n , output+'R');
        f(i,j+1,m ,n , output+'D');
    }

}

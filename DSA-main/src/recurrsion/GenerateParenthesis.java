package recurrsion;

public class GenerateParenthesis {
    static void main() {

        System.out.println(f(3,0,0,""));
    }
    static String f(int n , int o, int c, String output ){
        if(n == c) return output ;
        if( o > c ){
            f(n , o , c+1, output+")");
        }
        if( o < c ){
            f(n , o+1 , c , output+"(");
        }
        return output ;
    }
}

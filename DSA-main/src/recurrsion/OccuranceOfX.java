package recurrsion;

public class OccuranceOfX {
    static void main() {
        String S ="abcxxadxacxe";
        RemoveOccurance(S,0, 'x');
    }
    static void RemoveOccurance(String S, int n, char c){
        if(n==S.length()){
            return;
        }
        if(S.charAt(n)!=(c)){
            System.out.print(S.charAt(n));
        }
        RemoveOccurance(S,n+1,c);


    }
}

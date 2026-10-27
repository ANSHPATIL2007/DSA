package recurrsion;

public class Subsequence {
    static void main() {

        String str = "abc";
        sequence(str, 0 ,"");
    }
    static void sequence(String str , int idx , String output){
        if (idx == str.length()) {
            System.out.println(output);
            return;
        }
        sequence(str, idx+1, output + str.charAt(idx));
        sequence(str, idx+1, output);

    }
}

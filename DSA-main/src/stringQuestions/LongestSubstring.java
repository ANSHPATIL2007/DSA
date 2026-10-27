package stringQuestions;

public class LongestSubstring {
    static void main() {

        String str = "abshbdljasda";
        int [] indices = new  int[26];
        int maxi = 0;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (indices[idx] > 0) {
                maxi = Math.max(maxi,i- indices[idx]);
            }
            else  {
                indices[idx]=1+i;
            }
        }
        System.out.println(maxi);
    }
}

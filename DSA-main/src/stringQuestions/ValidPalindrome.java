package stringQuestions;

public class ValidPalindrome {
    static void main() {
        String str = "A man, a plan, a canal: Panama";
        boolean flag = false;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

            while(i < j && Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i < j && Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                flag = false;
            }
            else {
                flag = true;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

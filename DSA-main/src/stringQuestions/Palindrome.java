package stringQuestions;
import java.util.Scanner;
public class Palindrome {

    //Riya -> false
    //naman-> true

    static void main() {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        int i = 0,j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){

                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

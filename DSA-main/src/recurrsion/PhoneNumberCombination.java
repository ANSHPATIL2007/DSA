package recurrsion;

public class PhoneNumberCombination {
    public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static void main() {
        sequence("2399",0,"");
    }
    static void sequence(String str, int idx, String output) {
        if(idx == str.length()) {
            System.out.println(output);
            return;
        }
        int digit = str.charAt(idx) - '0';
        for(int k = 0 ;k < map[digit].length(); k++){
            sequence(str, idx+1, output + map[digit].charAt(k));
        }
    }
}

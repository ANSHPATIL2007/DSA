package stringQuestions;

public class fillUpString {
    static void main() {
        String str = "fi_er";
        String str1 = "fever:fixer:fiber:tailor:filer:filter";
        String[] words = str1.split(":");
        StringBuilder sb = new StringBuilder();
        int pos = str.indexOf('_');

        for (int j=0;j<words.length;j++){
            String temp = str.substring(0,pos)+words[j].charAt(pos)+str.substring(pos+1);
            if(temp.equals(words[j])){
                sb.append(temp+':');
            }
        }

        System.out.println(sb.toString().toUpperCase());
    }
}

import java.util.*;
public class PalindromeString
{
    public static boolean isPalindrome(String word) {
        boolean palin = true;
        int len = word.length();
        for (int i = 0; i <= len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                palin = false;
                break;
            }
        }
        return palin;
    }

    public static String makePalindrome(String word) {
        int len = word.length();
        char lastChar = word.charAt(len - 1);
        int i = len - 1;
        while (word.charAt(i) == lastChar) {
            i--;
        }
        String sb=word;
        for (int j = i; j >= 0; j--) {
            sb+=(word.charAt(j));
        }
        return sb;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String Str = sc.nextLine().trim().toUpperCase();
        int len = Str.length();
        char lastChar = Str.charAt(len - 1);
        if (lastChar != '.'&& lastChar != '?'&& lastChar != '!')
        {
            System.out.println("INVALID INPUT");
            return;
        }
        String str = Str.substring(0, len - 1);
        StringTokenizer st = new StringTokenizer(str);
        String sb="";
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            boolean isPalinWord = isPalindrome(word);
            if (isPalinWord) {
                sb+=word;
            }
            else {
                String palinWord = makePalindrome(word);
                sb+=palinWord;
            }
            sb+=" ";
        }
        System.out.println();
        System.out.println(Str);
        System.out.println(sb.trim());
    }
}
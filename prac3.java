package practicals;
import java.util.*;
public class prac3
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String s,ns="",ms="";
        System.out.println("Enter a sentence");
        s=sc.nextLine()+" ";
        int i;
        for (i=0;i<s.length();i++)
        {
          if (s.charAt(i)==32)
          {
              if (ns.length()>ms.length())
              ms=ns;
              ns="";
          }
          else 
          ns+=s.charAt(i);
        }
        System.out.println("The longest word is "+ ms);
        System.out.println("The length of the word "+ms.length());
    }
}
/* Sample Input: Tata football academy will play against mohan bagan
   Sample Output: The longest word: football: The length of the word: 8 */


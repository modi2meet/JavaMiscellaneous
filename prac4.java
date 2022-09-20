package practicals;
import java.util.*;
public class prac4
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String s;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        String ns=""+s.charAt(0);
        int i;
        for (i=0;i<s.length();i++)
        {
          if (s.charAt(i)==32)
          {
              ns+=s.charAt(i+1);
          }
        }
        System.out.println("The word is "+ns);
    }
}


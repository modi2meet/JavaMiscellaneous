package practicals;
import java.util.*;
public class prac2
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String s;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        int i,ltr=0,wrd=1;
        for (i=0;i<s.length();i++)
        {
          if (s.charAt(i)!=32)
          {
              ltr++;
          }
          else 
          wrd++;
        }
        System.out.println("No. of words= "+wrd);
        System.out.println("No. of letters= "+ltr);
    }
}



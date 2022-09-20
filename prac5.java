package practicals;
import java.util.*;
public class prac5
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String s;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        String ns="",ps="";
        int i,j;
        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=32)
            {
                ns+=s.charAt(i);
            }
            else
            {
                for (j=ns.length()-1;j>=0;j--)
                {
                    ps+=ns.charAt(j);
                }
                if (ns.compareTo(ps)==0)
                {
                    System.out.println(ns);
                }
                ns=""; ps="";
            }
        }
    }
}


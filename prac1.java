package practicals;
import java.util.*;
public class prac1 
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String s,ns="";
        System.out.println("Enter a string");
        s=sc.nextLine().toUpperCase();
        int i;
        for (i=s.length()-1;i>=0;i--)
        {
            ns+=s.charAt(i);
        }
        if (s.compareTo(ns)==0)
        {
            if (s.charAt(s.length()-1)==s.charAt(0))
            {
                System.out.println("it is a palindrome and special word");
            }
            else 
            System.out.println("it is a palindrome word");
        }
        else if (s.charAt(s.length()-1)==s.charAt(0))
        System.out.println("it is a special word");
        else
        System.out.println("it is neither a palindrome nor a special word");
    }
}



package recursion;
import java.util.Scanner;
class CountOdd
{
    int sum(int n)      
    {
        if(n==0)
        {
            return 0;
        } 
        return(n%2)+sum(n/10);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        CountOdd obj=new CountOdd ();
        int a;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        System.out.println("Sum of Odd Digits in "+a+" is "+obj.sum(a));
    }
}
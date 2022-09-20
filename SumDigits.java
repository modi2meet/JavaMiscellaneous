package recursion;
import java.util.Scanner;
class SumDigits
{
    int sum(int n)
    {
        if(n<=9)
            return n;
        else
            return n%10+sum(n/10);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        SumDigits obj=new SumDigits();
        int a;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        System.out.println("Sum of Digits in "+a+" is "+obj.sum(a));
    }
}
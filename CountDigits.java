package recursion;
import java.util.Scanner;
class CountDigits
{
    int count(int n)        
    {
        if(n<=9)
            return 1;
        else
            return 1+count(n/10);
    }             
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        CountDigits obj=new CountDigits();
        int a;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        System.out.println("Number of Digits in "+a+" is "+obj.count(a));
    }
}
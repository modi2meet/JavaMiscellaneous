package recursion;
import java.util.Scanner;
class Factorial
{
    int find(int n)
    {
        if(n<=0)
            return 1;
        else
            return n*find(n-1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Factorial obj=new Factorial();
        int a;
        System.out.println("Enter a number ");
        a=sc.nextInt();
        System.out.println("Factorial of "+a+" is "+obj.find(a));
    }
}
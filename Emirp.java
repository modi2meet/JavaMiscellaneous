import java.util. Scanner;
public class Emirp
{
    int n,rev,f;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }

    int isprime(int x)
    {
        if(n==x)
        {
            return 1;
        }
        else if (n%x == 0 ||n == 1)
        {
            return 0;
        }
        else
            return isprime(x+1);
    }

    void isEmirp()
    {
        int x=n;
        while(x!=0)
        {
            rev=(rev* 10) + x%10;
            x=x/10;
        }
        int ans1=isprime(f);
        n=rev;
        f=2;
        int ans2=isprime(f);
        System.out.println("The normal number returned "+ ans1+" and the reverse number returned "+ans2);
        if(ans1 ==1 && ans2==1)
            System. out.println(n+" is anEmirp number");
        else
            System.out.println(n+" is not an Emirp number");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter a number");
        int x=sc.nextInt();
        Emirp obj = new Emirp(x);
        obj.isEmirp();
    }
}
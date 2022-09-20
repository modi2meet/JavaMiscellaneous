import java.util.*;
public class pellseries
{
    public int pell(int n)
    {
        if (n <= 2)
            return n;
        return 2 * pell(n - 1) + pell(n - 2);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        pellseries obj=new pellseries();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(obj.pell(n));
    }
}

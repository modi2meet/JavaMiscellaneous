//encoder is used to convert any number from decimal, octal, or hexadecimal to  binary
import java.util.*;
public class encoder
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i=0;
        int b=0;
        int temp=num;
        while(temp>0)
        {
            b=b+(int)(temp%2*Math.pow(10,i++));
            temp=temp/2;
        }
        System.out.println("The binary number for "+num+" is "+b);
    }
}
/* 
 * 2^n must be >=I, where I is total number
 * Here I is 10, 2^n>=10 --> 2^4>=10; therefore output is 4
 */
 
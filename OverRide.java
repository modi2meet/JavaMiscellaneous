package RuntimePolymorphism;
public class OverRide
{
    public static void main()
    {
      Scanner sc=new Scanner (System.in);
      NumberSystem ptr;
      int ch;
      do
      {
          System.out.println("1. Decimal\n2.Binary\n3.Octal\n4.Hexadecimal\n5.Exit");
          ch=sc.nextInt();
          switch (ch)
          {
              case 1:
                  ptr= new Decimal();
                  ptr.convert(77);
                  break;
              case 2:
                  ptr= new Binary();
                  ptr.convert(77);
                  break;
              case 3:
                  ptr= new Octal();
                  ptr.convert(77);
                  break;
              case 4:
                  ptr= new Hexadecimal();
                  ptr.convert(77);
                  break;
              case 5:
                  System.out.println("Thank you");
                  break;
              default:
                  System.out.println("Wrong Input");
                  break;
          }
        }while (ch!=5);
      }
    }
}
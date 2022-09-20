import java.util.*;
class Encrypt
{
    static String wrd;
    static String newrd;
    static int vow;
    static int cons;
    void acceptword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine().toUpperCase();
        newrd=" ";
    }
    void freqvowcon()
    {
        for (int i=0;i<wrd.length();i++)
        {
          char ch=wrd.charAt(i);
          if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
              vow++;        
            }
          else
          {
              cons++;
          }         
          }
          System.out.println(" vowels in word = "+vow);
          System.out.println(" consonants in word = "+cons);
    }
    void nextVowel()
    {
        for (int i=0;i<wrd.length();i++)
        {
          char ch=wrd.charAt(i);
          if (ch=='A')
          {
              ch='E';
              newrd+=ch;
          }
          else if(ch=='E')
          {
              ch='I';
              newrd+=ch;
          }
          else if(ch=='I')
          {
              ch='O';
              newrd+=ch;
          }
          else if(ch=='O')
          {
              ch='U';
              newrd+=ch;
          }
          else if(ch=='U')
          {
              ch='A';
              newrd+=ch;
          }
          else
          {
              ch=ch;
              newrd+=ch;
          }
        } 
    }
    void disp()
    {
          System.out.println("Original word = " +wrd);
          System.out.println("Encrypted word = " +newrd);
    }
    public static void main()
    {
        Encrypt obj=new Encrypt();
        obj.acceptword();
        obj.freqvowcon();
        obj.nextVowel();
        obj.disp();
    }
}
package stringtokenizer;
import java.util.*;
class WordByWord
{
    String str;
    WordByWord()
    {
        str="";
    }

    WordByWord(String s)
    {
        str=s;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        str=sc.nextLine();
    }

    void vertical()
    {   
        StringTokenizer st=new StringTokenizer(str," ");//st=
        while(st.hasMoreTokens())   //It will return "true" if st has any word
        {                           //otherwise it will return "false"
        System.out.println("The number of tokens left:"+st.countTokens());
        System.out.println(st.nextToken()); //Will extact each word from st
        }
    }

    public static void main()
    {
        WordByWord obj=new WordByWord();
        obj.input();
        obj.vertical();
    }

}
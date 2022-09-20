package RuntimePolymorphism;
class Hexadecimal extends NumberSystem
{
    void convert(int n)        
    {                           
        String hex="";          
        int r; 
        char a[]={'A','B','C','D','E','F'};
        while(n>0)              
        {
            r=n%16;
            if (r>9)
               hex=a[(r-10)]+hex;
            else
               hex=r+hex;
            n/=16;
        }
        System.out.println("Hexadecimal Number is "+hex);
    }
}


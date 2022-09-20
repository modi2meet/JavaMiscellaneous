package RuntimePolymorphism;
class NumberSystem
{
    void convert(int n)
    {
        System.out.println("The Number is "+n);
    }
    void convertReadyMade(int n)  
    {                           
        System.out.println("Binary Number is "+Integer.toBinaryString(n));
        System.out.println("Octal Number is "+Integer.toOctalString(n));
        System.out.println("HexaDecimal Number is "+Integer.toHexString(n));
    }
}

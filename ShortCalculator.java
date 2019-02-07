 


public class ShortCalculator {
    public short sum(short num1, short num2)
    {
        return (short)(num1 + num2) ;
    }
    
    public short difference(short num1, short num2)
    {
        return (short)Math.abs(num1 - num2);
    }
    
    public short product(short num1, short num2)
    {
        return (short)(num1 * num2);
    }
    
    public short quotient(short num1, short num2)
    {
        return (short)(num1 / num2);
    }
    
    public short remainder(short num1, short num2)
    {
        return (short)(num1 % num2);
    }
}

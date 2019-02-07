 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger factorial = new BigInteger("1");
        for(int count = 2; count <= value; count++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(count));
        }
        return factorial;
    }

}

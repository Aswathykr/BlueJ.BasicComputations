import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//unsigned sum, difference, product, quotient, and remainder
public class ShortCalculatorTest {
    private ShortCalculator shortCalculator;

    @Before
    public void setUp(){
        shortCalculator = new ShortCalculator();
    }
    
    @Test
    public void sumTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 20;
        short num2 = 10;
        short actual = shortCalculator.sum(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }
    
    @Test
    public void differenceTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 70;
        short num2 = 40;
        short actual = shortCalculator.difference(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }
    @Test
    public void unsignedDifferenceTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 40;
        short num2 = 70;
        short actual = shortCalculator.difference(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }
    @Test
    public void productTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 15;
        short num2 = 2;
        short actual = shortCalculator.product(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }
    
    @Test
    public void quotientTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 90;
        short num2 = 3;
        short actual = shortCalculator.quotient(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }
    
    @Test
    public void remainderTest(){
        // :Given
        short expected = 30;

        // :When
        short num1 = 70;
        short num2 = 40;
        short actual = shortCalculator.remainder(num1,num2);
        // :Then
        Assert.assertEquals("The sum should be 30", expected, actual);
    }

}

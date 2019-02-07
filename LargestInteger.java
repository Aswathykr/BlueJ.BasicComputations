 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int largest = Integer.MIN_VALUE;
        for(int count = 0; count < integers.length; count++)
        {
            if(integers[count] > largest)
                largest = integers[count];
        }
        return largest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int largest = Integer.MIN_VALUE;
        for(int count = 0; count < integers.length; count++)
        {
                largest = Math.max(largest,integers[count]);
        }
        return largest;
    }
}

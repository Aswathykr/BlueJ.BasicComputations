 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        
        return Integer.toBinaryString(value);
        //return Integer.toString(value,2);

    }

    public String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
        //return String.format("%o", value); 
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
        //return String.format("%h", value); 
    }

    public static void main(String[] args){

    }
}

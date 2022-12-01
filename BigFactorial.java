import java.math.BigInteger;
import java.io.*;
import NumberException.NegativeNumberException;


public class BigFactorial{
    static BigInteger factorial(int num)throws Exception{
        if(num<0){throw new Exception("Negative Number is not allowed");}
	    BigInteger n = new BigInteger(String.valueOf(num));

        if (num == 1) return BigInteger.ONE;

        return n.multiply(factorial(num-1));
    }

    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	    try{
//            System.out.println(factorial(num));
            System.out.println(100/num);
	    }catch(Exception e){System.out.println(e);}
    }
}
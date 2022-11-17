import java.math.BigInteger;
import java.io.*;

class NegativeNumberException extends Exception{
	public String toString(){
		return "NegativeNumberException ocuured";
	}

	public String getMessage(){
		return "Negative Number is not Allowed";
	}

}

public class BigFactorial{
    static BigInteger factorial(int num)throws NegativeNumberException{
        if(num<0){
		throw new NegativeNumberException();
	}
	BigInteger n = new BigInteger(String.valueOf(num));

        if (num == 1) return BigInteger.ONE;

        return n.multiply(factorial(num-1));
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        int num = Integer.parseInt(br.readLine());
	try{
        System.out.println(factorial(num));
	}catch(Exception e){System.out.println(e);}
    }
}
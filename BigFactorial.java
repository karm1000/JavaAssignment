import java.math.BigInteger;
import java.io.*;

public class BigFactorial{
    static BigInteger factorial(int num) {
        BigInteger n = new BigInteger(String.valueOf(num));

        if (num == 1) return BigInteger.ONE;

        return n.multiply(factorial(num-1));
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        int num = Integer.parseInt(br.readLine());

        System.out.println(factorial(num));

    }
}
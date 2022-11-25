import java.io.*;
import NumberException.NegativeNumberException;
public class Factorial{

	static long factorial(int n)throws NegativeNumberException{
		if(n<0)throw new NegativeNumberException(); 
		long f=1;
		for(int i=1;i<=n;i++){
			f = f*i;
		}
		return f;
	}
	
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Value : ");
		int num = Integer.parseInt(br.readLine());

		try{
			System.out.println("num! = "+ factorial(num));	
		}catch(Exception e){System.out.println(e);}
	}


}
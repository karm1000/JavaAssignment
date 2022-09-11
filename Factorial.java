import java.io.*;

public class Factorial{
	
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Value : ");
		int num = Integer.parseInt(br.readLine());
		long f=1;
		for(int i=1;i<=num;i++){
			f = f*i;
		}

		
		System.out.println("Factorial = "+ f);	

	}


}
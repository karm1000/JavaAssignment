import java.io.*;

public class Fibonacci{
	
	static void printFibonacci(int n){
		long f1=1;
		long f2=1;
		long fib = 0;
		for(int i=0;i<n;i++){
			if(i==0 || i==1){
				System.out.print(1+" ");	
			}
			else{
				fib = f1 + f2;
				f1 = f2;
				f2 = fib;
				
				System.out.print(fib+" ");
			}
		}
	}	

	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Value : ");
		int num = Integer.parseInt(br.readLine());
		printFibonacci(num);
	}
}
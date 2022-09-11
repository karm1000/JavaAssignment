import java.io.*;

class Prime{
	
	static boolean isPrime(int n){
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0)return false;
		}
		return true;
		
	}
	
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Value : ");
		int num = Integer.parseInt(br.readLine());
		//int n=2;
		int count=0;
		
		//System.out.println((isPrime(num))?"Is Prime":"Not Prime");
		
		
			
		for(int i=2;count!=num;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		
		
		
	}


}
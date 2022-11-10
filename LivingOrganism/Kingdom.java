package livingOrganism;

import java.io.*;

public class Kingdom {
	String kingdom;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Kingdom()throws IOException {
		System.out.println("Enter Kingdom - ");
		this.kingdom=br.readLine();
	}
	public Kingdom(String kingdom){
		this.kingdom=kingdom;
	}
	public void show(){
		System.out.println("Kingdom - "+ kingdom);
	}
}
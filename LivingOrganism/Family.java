package LivingOrganism;
import java.io.*;

//5

public class   Family extends Order{
	String family;
	public Family()throws IOException{
		super();
		System.out.println("Enter Family - ");
		this.family=br.readLine();
	}
	public Family(String family,String order,String cLass,String phylum,String kingdom){
		super(order,cLass,phylum,kingdom);
		this.family=family;
	}
	public void show(){
		super.show();
		System.out.println("Family - "+family);
	}

}

package LivingOrganism;
import java.io.*;

//3
public class CLASS extends Phylum{
	String cLass;
	public CLASS()throws IOException{
		super();
		System.out.println("Enter Class - ");
		this.cLass=br.readLine();
	}
	public CLASS(String cLass,String phylum,String kingdom){
		super(phylum,kingdom);
		this.cLass=cLass;
	}
	public void show(){
		super.show();
		System.out.println("cLass = "+cLass);
	}
}
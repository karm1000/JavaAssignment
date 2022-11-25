package LivingOrganism;
import java.io.*;

//6
public class Genus extends Family{
	String genus;
	public Genus()throws IOException{
		super();
		System.out.println("Enter Genus - ");
		this.genus=br.readLine();
	}
	public Genus(String genus,String family,String order,String cLass,String phylum,String kingdom){
		super(family,order,cLass,phylum,kingdom);
		this.genus=genus;
	}
	public void show(){
		super.show();
		System.out.println("Genus  - "+genus);
	}
}
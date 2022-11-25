package LivingOrganism;
import java.io.*;
//7

public class Species extends Genus{
	String species;
	public Species()throws IOException{
		super();
		System.out.println("Enter Species - ");
		this.species=br.readLine();
	}
	public Species(String species,String genus,String family,String order,String cLass,String phylum,String kingdom){
		super(genus,family,order,cLass,phylum,kingdom);
		this.species=species;
	}
	public void show(){
		super.show();
		System.out.println("Species - "+ species);
	}
}
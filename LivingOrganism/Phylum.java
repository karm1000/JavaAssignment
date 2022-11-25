package LivingOrganism;

import java.io.*;

//2
public class Phylum extends Kingdom{
	String phylum;
	public Phylum()throws IOException{
		super();
		System.out.println("Enter Phylum - ");
		this.phylum=br.readLine();
	}

	public Phylum(String phylum,String kingdom){
		super(kingdom);
		this.phylum=phylum;
	}

	public void show(){
		super.show();
		System.out.println("Phylum - "+phylum);
	}
}
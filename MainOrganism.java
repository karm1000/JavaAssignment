import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*class LivingOrganism{
	String kingdom;
	String phylum;
	String cLass;
	String order;
	String family;
	String genus;
	String species;
	public LivingOrganism(){}
}*/

class Kingdom {
	String kingdom;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Kingdom()throws IOException {
		System.out.println("Enter Kingdom - ");
		this.kingdom=br.readLine();
	}
	public void show(){
		System.out.println("Kingdom - "+ kingdom);
	}
}

class Phylum extends Kingdom{
	String phylum;
	public Phylum()throws IOException{
		super();
		System.out.println("Enter Phylum - ");
		this.phylum=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("Phylum - "+phylum);
	}

}

class CLASS extends Phylum{
	String cLass;
	public CLASS()throws IOException{
		super();
		System.out.println("Enter Class - ");
		this.cLass=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("cLass = "+cLass);
	}
}

class Order extends CLASS{
	String order;
	public Order()throws IOException{
		super();
		System.out.println("Enter Order - ");
		this.order=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("Order - "+order);
	}
}

class Family extends Order{
	String family;
	public Family()throws IOException{
		super();
		System.out.println("Enter Family - ");
		this.family=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("Family - "+family);
	}

}

class Genus extends Family{
	String genus;
	public Genus()throws IOException{
		super();
		System.out.println("Enter Genus - ");
		this.genus=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("Genus  - "+genus);
	}

}

class Species extends Genus{
	String species;
	public Species()throws IOException{
		super();
		System.out.println("Enter Species - ");
		this.species=br.readLine();
	}
	public void show(){
		super.show();
		System.out.println("Species - "+ species);
	}
}



public class MainOrganism{

	public static void main(String []args)throws IOException{
		Species s1 = new Species();
		s1.show();
	
	
	}


}
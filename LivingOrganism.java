import java.io.BufferedReader;

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
	BufferedReader br = new BufferedReader(new InputStream(System.in));

	public Kingdom(){ 
		System.out.println("Enter Kingdom - ");
		this.kingdom=br.read();
	}
	public void show(){
		System.out.println("Kingdom - "+ kingdom);
	}
}

class Phylum extends Kingdom{
	String phylum;
	public Phylum(){
		super();
		System.out.println("Enter Phylum - ");
		this.phylum=br.read();
	}
	public void show(){
		super.show();
		System.out.println("Phylum - "+phylum);
	}

}

class CLASS extends Phylum{
	String cLass;
	public Mammalia{
		super();
		System.out.println("Enter Class - ");
		this.cLass=br.read();
	}
	public void show(){
		super.show();
		System.out.println("cLass = "+cLass);
	}
}

class Order extends CLASS{
	String order;
	public Order{
		super();
		System.out.println("Enter Order - ");
		this.order=br.read();
	}
	public void show(){
		super.show();
		System.out.println("Order = "+order);
	}
}

class Family extends Order{
	String family;
	public Family(){
		super();
		System.out.println("Enter Family - ");
		this.family=br.read();
	}
	public void show(){
		super.show();
		System.out.println("Family - "+family);
	}

}

class Genus extends Family{
	String genus;
	public Genus(){
		super();
		System.out.println("Enter Genus - ");
		this.genus=br.read();
	}
	public void show(){
		super.show();
		System.out.println("Genus  - "+genus);
	}

}

class Species extends Genus{
	String species;
	public Species(){
		super();
		System.out.println("Enter Species - ");
		this.species=br.read();
	}
	public void show(){
		super.show();
		System.out.println("Species - "+ species);
	}
}

class Organism extends Species{
	
}

public class MainOrganism{

	public static void main(String []args){
		Organism o = new Organism();
		o.show();
	
	
	}


}
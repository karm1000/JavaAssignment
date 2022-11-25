package LivingOrganism;
import java.io.*;

//4
public class Order extends CLASS{
	String order;
	public Order()throws IOException{
		super();
		System.out.println("Enter Order - ");
		this.cLass=br.readLine();
	}
	public Order(String order,String cLass,String phylum,String kingdom){
		super(cLass,phylum,kingdom);
		this.order=order;
	}
	public void show(){
		super.show();
		System.out.println("Order = "+order);
	}
}
import java.util.Scanner;
import LivingOrganism.Species;

public class UsingLivingOrganism{
	
	static int ask()throws Exception{
		System.out.println("Select from given Option - "
				+"\n1.Homo Sapiens\n2.Lion \n3.Cow "/* \n4. Snake */ +"\n4.Exit");
		Scanner sc = new Scanner(System.in);


		int op = sc.nextInt();
		return op;
	}
	
	public static void main(String []args){
		boolean flag = true;
		LivingOrganism.Species species = null;
		loop : do{
			try {
				int option = ask();
				switch(option){
					case 1:{ species = new Species("Homo Sapiens","Homo","Hominidae","Primates","Mammalia","Chordata","Animilia");}
					break;
					case 2:{species = new Species("P. leo","Panthera","Felidae","Carnivora","Mammalia","Chordata","Animilia");}
					break;
					case 3:{species = new Species("B. taurus","Bos","Bovidae","Artiodactyla","Mammalia","Chordata","Animilia");}
					break;
				/*case 1:{species = new Species("Homo Sapians","Homo","Hominidae","Primates","Mammalia","Chordata","Animilia");}
					break;*/
					case 4:{
						flag = false;
						break loop;
					}
					default: break;

				}
				species.show();
			}catch (Exception e){
				System.out.println(e);
				System.out.println("Use Integer Input");
			}

		}while(flag);
	}
}
//import myTime.MyTime;

public class Using_myTime {
	public static void main(String []args){
		try{
			myTime.MyTime t1 = new myTime.MyTime(10,63,32);
			t1.displayTime();
		}catch(Exception e){System.out.println(e);}
		
	}
}
//import myTime.MyTime;

import myTime.DiffT;
import myTime.MyTime;

public class Using_myTime {
	public static void main(String []args)throws myTime.exception.TimeFormatException {
		myTime.MyTime t1 = new myTime.MyTime(7,23,40);
		MyTime t2 = new MyTime(12,46,33);
			t1.displayTime();
			t2.displayTime();
			MyTime t = new DiffT(t1,t2);
			t.displayTime();

		
	}
}
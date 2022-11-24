package myTime;
import myTime.exception.TimeFormatException;
//import myTime.Second;
/**
 * This is Minute class , inherits Second'
 * @see <a href="Second.html">Seconds</a>
 */

public class Minute extends Second {
    /**
     * Stores minutes
     */
    int minute;

    /**
     * Default Constructor
     */
    public Minute(){}

    /**
     * Initialize minute and second
     * (second is more than 59 or second is less than 0 is initialized to 0)
     * (minute is more than 59 or minute is less than 0 is initialized to 0)
     * @see Second
     * @param minute
     * @param second
     */
    public Minute(int minute,int second)throws TimeFormatException{
        //try{
	super(second);
	//}catch(Exception e){System.out.println(e);}
	if(minute>59 || minute<0){
		throw new TimeFormatException();
	}
        this.minute = minute;
    }
}


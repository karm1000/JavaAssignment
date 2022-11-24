package myTime;
import myTime.exception.TimeFormatException;

//import myTime.Minute;
/**
 * This is Hour class , inherits Minute.
 * @see <a href="Minute.html">Minute</a>
 * @see <a href="Second.html">Second</a>
 */
public class Hour extends Minute{
    /**
     * Stores hour
     */
    int hour;

    /**
     * Default constructor
     */
    public Hour(){}

    /**
     * Initialize hour, minute and second
     * (second is more than 59 or second is less than 0 is initialized to 0)
     * (minute is more than 59 or minute is less than 0 is initialized to 0)
     * (hour is more than 23 or minute is less than 0 is initialized to 0)
     * @param hour
     * @param minute
     * @param second
     */
    public Hour(int hour,int minute,int second)throws TimeFormatException{
        //try{
	super(minute,second);
	//}catch(Exception e){System.out.println(e);}
	if(hour>23 || hour<0){throw new TimeFormatException();}
        this.hour = hour;
    }

}

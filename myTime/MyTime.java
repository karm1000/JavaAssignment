package myTime;
import myTime.exception.TimeFormatException;
//import myTime.Hour;
/**
 * This is MyTime class ,Inherits Hour
 *
 * @see <a href = "Hour.html">Hour</a>
 * @see <a href="Minute.html">Minute</a>
 * @see <a href="Second.html">Second</a>
 */
public class MyTime extends Hour{
    /**
     * Stores Time in seconds
     */
    int timeInSeconds;

    /**
     * Default Constructor
     */
    public MyTime(){}

    /**
     *Initializes MyTime and Converts it into seconds
     * @param hour
     * @param minute
     * @param second
     */
    public MyTime(int hour,int minute,int second)throws TimeFormatException{
        //try{
	super(hour,minute,second);
	timeInSeconds = convertToSecond();
	//}catch(Exception e){System.out.println(e);}
        
    }

    /**
     * Converts time into seconds
     * @return time in second
     */
    public int convertToSecond(){
        return (hour*60*60)+(minute*60)+second;
    }

    /**
     * Displays Time
     */
    public void displayTime(){
        System.out.println(
                (hour<10?"0"+hour:hour)+":"+(minute<10?"0"+minute:minute)+":"+(second<10?"0"+second:second)
            );
        }
}

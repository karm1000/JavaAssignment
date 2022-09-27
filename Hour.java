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
    public Hour(int hour,int minute,int second){
        super(minute,second);
        this.hour = (hour>22 || hour<0?0:hour);
    }

}

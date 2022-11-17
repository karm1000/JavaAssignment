package myTime;
import myTime.exception.TimeFormatException;
/**
 * This is Second class.
 * @version 2.0
 * @author KarmSoni
 */
public class Second {
    int second;

    /**
     * Default constructor
     */
    public Second(){}

    /**
     * Initializes seconds
     * (second is more than 59 or second is less than 0 is initialized to 0)
     * @param second
     */
    public Second(int second) throws TimeFormatException{
	if(second>59 || second<0){
		throw new TimeFormatException();
	}
        this.second = (second>59 || second<0?0:second);
    }
}

package myTime;

import myTime.MyTime;
/**
 * This is DiffT ,Inherits Time
 * @see <a href ="Time.html">Time</a>
 */
public class DiffT extends MyTime {
    /**
     * The only Constructor that takes two Time as Parameters and find difference between it.
     * @param t1 Time 1
     * @param t2 Time 2
     */
    public DiffT(MyTime t1, MyTime t2){
        timeInSeconds = (t1.timeInSeconds>t2.timeInSeconds?t1.timeInSeconds-t2.timeInSeconds:t2.timeInSeconds-t1.timeInSeconds);
        second = timeInSeconds%60;
        int timeInMinutes = (int) timeInSeconds/60;
        minute = timeInMinutes%60;
        hour = (int) timeInMinutes/60;
    }
}

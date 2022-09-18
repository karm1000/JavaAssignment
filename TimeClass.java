import java.lang.reflect.Method;

/**
 * @author karmsoni
 *
 */


class Second{
    int second;
    public Second(){}
    public Second(int s){
        second = (s>60 || s<0?0:s);
    }
}
class Minute extends Second{
    int minute;
    public Minute(){}
    public Minute(int m,int s){
        super(s);
        minute = (m>60 || m<0?0:m);
    }
}

class  Hour extends Minute{
    int hour;
    public Hour(){}
    public Hour(int h,int m,int s){
        super(m,s);
        hour = (h>24 || h<0?0:h);
    }
}

class Time extends Hour{
    int timeInSeconds;
    public Time(){}
    public Time(int h,int m,int s){
        super(h,m,s);
        timeInSeconds = convertToSecond();
    }
    public int convertToSecond(){
        return (hour*60*60)+(minute*60)+second;
    }

    public void displayTime(){
        System.out.println(
                (hour<10?"0"+hour:hour)+":"+(minute<10?"0"+minute:minute)+":"+(second<10?"0"+second:second)
        );
    }


}

class Diff extends Time{

    public Diff(Time t1,Time t2){
        timeInSeconds = (t1.timeInSeconds>t2.timeInSeconds?t1.timeInSeconds-t2.timeInSeconds:t2.timeInSeconds-t1.timeInSeconds);
        second = timeInSeconds%60;
        int timeInMinutes = (int) timeInSeconds/60;
        minute = timeInMinutes%60;
        hour = (int) timeInMinutes/60;
    }
}

public class TimeClass {
    public static void main(String[] args) {
        Time t1 = new Time(25,61,61);
        t1.displayTime();
        Time t2 = new Time(23,12,12);
        t2.displayTime();
        Time t = new Diff(t2,t1);
        t.displayTime();

//        System.exit;

    }
}

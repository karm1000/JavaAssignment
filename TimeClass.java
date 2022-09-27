public class TimeClass {
    public static void main(String[] args) {
        Time t1 = new Time(6,12,51);
        t1.displayTime();
        Time t2 = new Time(23,12,12);
        t2.displayTime();
        Time d = new DiffT(t1,t2);
        d.displayTime();
    }
}

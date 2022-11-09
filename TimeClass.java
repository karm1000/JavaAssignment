public class TimeClass {
    public static void main(String[] args) {
        Time t1 = new Time(0,0,0);
        t1.displayTime();
        Time t2 = new Time(0,0,0);
        t2.displayTime();
        Time d = new DiffT(t1,t2);
        d.displayTime();
        System.out.println(t1.toString());
    }
}

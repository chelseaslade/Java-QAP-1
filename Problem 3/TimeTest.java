public class TimeTest {
    
    public static void main(String[] args) 
    {
        Time t1 = new Time();
        Time t2 = new Time();

        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        t1.nextSecond();
        t2.previousSecond();

        t1.toString();
        t2.toString();
    }

}

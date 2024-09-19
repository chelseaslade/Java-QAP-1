public class Time {
    
    //Attributes
    private int hour;
    private int minute;
    private int second;

    //Constructors
    //Parameterized Constructor
    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Default Constructor
    public Time()
    {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    //Methods
    public int getHour() 
    {
        return this.hour;
    }

    public int getMinute() 
    {
        return this.minute;
    }

    public int getSecond() 
    {
        return this.second;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public void setMinute(int minute) 
    {
        this.minute = minute;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) 
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() 
    {
        String timeString =  this.hour + ":" + this.minute + ":" + this.second;
        System.out.println(timeString);
        return timeString;
    }

    public int nextSecond() 
    {
        this.second = this.second + 1;
        return this.second;
    }

    public int previousSecond() 
    {
        this.second = this.second -1;
        return this.second;
    }
}
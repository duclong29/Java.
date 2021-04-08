package exe4;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour () {
        return hour;
    }
    public int getMinute () {
        return minute;
    }
    public int getSecond () {
        return second;
    }
    public void setHour (int hour) {
        this.hour = hour;
    }
    public void setMinute (int minute) {
        this.minute = minute;
    }
    public void setSecond (int second) {
        this.second = second;
    }
    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString () {
        return "'" + hour + ":" + minute + ":" + second + "'";
    }
    public Time nextSecond () {
        if (second == 59) {
            second = 0;
            minute += 1;
        }
        if (minute == 60) {
            minute = 0;
            hour += 1;
        }
        else {
            second += 1;
        }
        return this;
    }

    public static void main(String[] args) {
        Time t = new Time(8, 59,59) ;
        System.out.println(t.hour);
        System.out.println(t.minute);
        System.out.println(t.second);
        System.out.println(t);
        System.out.println(t.nextSecond());
    }
}

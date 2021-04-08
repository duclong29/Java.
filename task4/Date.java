package exe4;

class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month =month;
        this.year = year;
    }
    public int getDay () {
        return day;
    }
    public int getMonth () {
        return month;
    }
    public int getYear () {
        return year;
    }
    public void setDay (int day) {
        this.day = day;
    }
    public void setMonth (int month) {
        this.month = month;
    }
    public void  setYear (int year) {
        this.year = year;
    }
    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString () {
        return "'" + day + "/" + month + "/" + year + "'";
    }

    public static void main(String[] args) {
        Date d = new Date(29, 06, 2000);
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.toString());
        System.out.println("----------");
        d.setDate(11, 12, 2001);
        System.out.println(d);


    }


}

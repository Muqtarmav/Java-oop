package chapten10;

public class Date {
    private int month;
    private int day;
    private int year;

//    public Date(int month, int day, int year){
//        this.month = month;
//        this.day = day;
//        this.year = year;
//    }





    public void setDate (int month, int day, int year){
        if (month < 0 || month > 12 || day < 0 ||  day > 31 || year < 2000)
            throw new IllegalArgumentException("month is not valid, day is not valid");

             this.month = month;
            this.day = day;
            this.year = year;
    }

    public String toString (){
        return String.format("%d%d%d", month, day, year);
    }

}

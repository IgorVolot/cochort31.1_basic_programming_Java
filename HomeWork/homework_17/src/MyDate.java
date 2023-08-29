package src;

public class MyDate {
    public int day;
    public int month;
    public int year;

    public MyDate (int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString (){
        if (day<0 || day>31){
            return "error";
        } else if (month<0 || month>12) {
            return "error";
        } else
        return (day<10?"0"+day:day)+". "+(month<10?"0"+month:month)+". "+year;
    }
}

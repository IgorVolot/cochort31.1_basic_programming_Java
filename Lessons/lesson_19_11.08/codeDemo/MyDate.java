package codeDemo;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean format=true;

    public MyDate(int day, int month, int year){
//        if (!isArgCorrect(day,month,year)) throw new Exception();  // это пример проверки вводимых данных
        this.day=day;
        this.month=month;
        setYearOrDefualtValue(year);  // это пример проверки вводимых данных
    }
    private void setYearOrDefualtValue(int year){
        this.year = (year>=2000)? year:2000; // это пример проверки вводимых данных
    }
    private boolean isArgCorrect(int day, int month, int year){
        // TODO implements checking parameters  // "TODO" - Idea function as reminder.
        return true;
    }
    public String toString(){
        if (!format){
            return year+"-"+month+"-"+day;
        } else {
            return day+"-"+month+"-"+year;
        }
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return this.year;  // you can call for parameter like this
    }
    public void setFormat(boolean format){
        this.format=format;
    }

}

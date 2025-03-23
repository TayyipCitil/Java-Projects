package ObjectOrientedProgramming.Week5.Employee;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day,int month, int year) {
        if(year<0) throw new IllegalArgumentException("!!!Year must be positive");
        if(month<=0 || month>12) throw new IllegalArgumentException("!!!Month must be in 1-12");
        if(isLeapYear() && month==2){
            if(day<=0 || day>Months.months[month-1].daysPerMonths+1)//29 Şubat
                throw new IllegalArgumentException("!!!Day must be in 1-"+Months.months[month-1].daysPerMonths+1);
        }else {
            if(day<=0 || day>Months.months[month-1].daysPerMonths)
                throw new IllegalArgumentException("!!!Day must be in 1-"+Months.months[month-1].daysPerMonths);
        }
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public enum Months{
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);
        private final int daysPerMonths;
        public static final Months[] months={JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER};
        Months(int daysPerMonths){
            this.daysPerMonths=daysPerMonths;
        }
    }

    public int getYear() {return year;}
    public int getDay() {return day;}
    public int getMonth() {return month;}

    public void setYear(int year) {
        if(year<0) throw new IllegalArgumentException("!!!Year must be positive");
        this.year = year;
    }
    public void setMonth(int month) {
        if(month<=0 || month>12) throw new IllegalArgumentException("!!!Month must be in 1-12");
        this.month=month;
    }
    public void setDay(int day) {
        if(isLeapYear() && month==2){
            if(day<=0 || day>Months.months[month-1].daysPerMonths+1)//29 Şubat
                throw new IllegalArgumentException("!!!Day must be in 1-"+Months.months[month-1].daysPerMonths+1);
        }else {
            if(day<=0 || day>Months.months[month-1].daysPerMonths)
                throw new IllegalArgumentException("!!!Day must be in 1-"+Months.months[month-1].daysPerMonths);
        }
        this.day=day;
    }
    public boolean isLeapYear(){//artik yıl
        return (year%400==0 || (year%4==0 && year%100!=0));
    }
    public String toString(){
        return String.format("%02d/%02d/%d",day,month,year);
    }
    public void printObj(){
        System.out.println(this);
    }

}

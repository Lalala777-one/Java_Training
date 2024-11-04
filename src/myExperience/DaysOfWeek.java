package myExperience;

public enum DaysOfWeek {

    /*
    Создайте перечисление для дней недели. Реализуйте метод,
    который будет возвращать, является ли данный день будним или выходным.

System.out.println(DaysOfWeek.MONDAY.isWeekend()); // false
System.out.println(DaysOfWeek.SATURDAY.isWeekend()); // true

     */

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    DaysOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}


    /*


    private int dayOfWeek;

    DaysOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public boolean isWeekend(){
        if(dayOfWeek == 6 || dayOfWeek == 7){
            return true;
        }
       return false;
    }


    */





class Test{
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY.isWeekend());
        System.out.println(DaysOfWeek.SATURDAY.isWeekend());
    }
}

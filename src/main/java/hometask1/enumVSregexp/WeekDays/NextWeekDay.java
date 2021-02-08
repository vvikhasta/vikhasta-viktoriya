package java.hometask1.enumVSregexp.WeekDays;

enum WeekD {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    WeekD next() {
        if (this==SUNDAY){
            return WeekD.values()[0];
        } else {
            return WeekD.values()[this.ordinal()+1];
        }
    }
    public class NextWeekDay {
    }
}
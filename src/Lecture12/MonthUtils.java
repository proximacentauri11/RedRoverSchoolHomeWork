package Lecture12;

public class MonthUtils {

    public static Month JANUARY = makeMonth("january");

    private static Month makeMonth(java.lang.String january) {
        return null;
    }

    private static Month makeMonth(String name) {
        Month month = new Month();
        month.name = name;
        return month;
    }

}

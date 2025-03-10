package applications;

import java.util.Calendar;

import entities.Dates;


public class Main {
    public static void main(String[] args) {
        Calendar currentDate = Calendar.getInstance();

        Dates today = new Dates(currentDate.get(Calendar.DAY_OF_MONTH), currentDate.get(Calendar.MONTH) + 1, currentDate.get(Calendar.YEAR));
        today.printDate();

        Dates christmas = new Dates(25, 12, 2012);
        christmas.printDate();
    }
}

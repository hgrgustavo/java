package entities;

public class Dates {
    private int day;
    private int month;
    private int year;

    // Getters
    public int getDay() { return this.day; }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    // Setters
    public void setDay(int d) {
        this.day = d;
    }
    public void setMonth(int m) {
        this.month = m;
    }
    public void setYear(int y) {
        this.year = y;
    }

    // Constructor
    public Dates(int d, int m, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }


    // Methods
    public void printDate() {
        System.out.print(getDay() + "/" + printMonth() + "/" + getYear());
    }

    public String printMonth() {
        return switch (getMonth()) {
            case 1 -> "Jan";
            case 2 -> "Fev";
            case 3 -> "Mar";
            case 4 -> "Abr";
            case 5 -> "Mai";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Ago";
            case 9 -> "Set";
            case 10 -> "Out";
            case 11 -> "Nov";
            case 12 -> "Dez";
            default -> " / ";
        };
    }

}

public class HW2 {
    public static void main(String[] args) {
        int[] years = {2022, 2023, 2024};
        int[] month = {9, 10, 11};
        int[] date = {30, 31, 30};
        Date[] dates = new Date[3];

        // for loop
        for (int i = 0; i < 3; i++) {
            dates[i] = new Date(years[i], month[i], date[i]);
        }
        // enhance-for
        for (Date j : dates) {
            System.out.println(j.printDate());
        }
    }
}

class Date{
    private int year;
    private int month;
    private int date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public String printDate() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}

public class HW2 {
    public static void main(String[] args) {
        Date d = new Date();

        // 설정자와 접근자 중 하나를 이용해 생일 설정
        d.setYear(2007);
        d.setMonth(6);
        d.setDay(1);

        System.out.println("생일은 " + d.toString() + "입니다.");

        // 설정자와 접근자 모두 사용하여 성년 설정
        d.setYear(d.getYear() + 20);
        System.out.println("성년일은 " + d.toString() + "입니다.");
    }
}

class Date {

    private int year;
    private int month;
    private int day;

    // this 키워드를 사용하도록 변경
    public Date() {
        this.year = 1900;
        this.month = 1;
        this.day = 1;
    }

    // 설정자와 접근자 완성
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // 설정자와 접근자 중 하나를 이용해 완성
    public String toString() {
        String rslt = "";
        rslt += this.getYear() + "년";
        rslt += this.getMonth() + "월 ";
        rslt += this.getDay() + "일";
        return rslt;
    }
}
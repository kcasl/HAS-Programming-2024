public class HW4 {
    public static void main(String[] args) {

        int year = 2020;
        int month = 13;
        int day = 0;

        System.out.println(year + "년의 " + month + "월");

            switch (month) {
                case 2:
                    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                        day = 29;
                    }
                    else {
                        day = 28;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    day = 31;
                    break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                    day = 30;
                    break;
                default:
                    System.out.println("달을 잘못 입력하였습니다.");
        }
        if ((1 <= month) && (12 >= month)) {
            System.out.println("달의 날 수는 " + day);
        }
    }
}

public class HW2 {
    public static void main(String[] args) {
        boolean school = true;
        int money = 10000;

        if (money >= 8000)
            System.out.println("Taxi");
        else if (money >= 1300) {
            if (school)
                System.out.println("Bus fare, teen");
            else
                System.out.println("Bus fare, adult");

        // 8000원 이상일 때 택시를 타는 조건을 위로 올려 먼저 비교하게 한다.
        // 기존코드는 돈이 1300 이상일 경우를 판별한 후 거짓이라면 이후 조건으로 넘어가게 했지만 이렇게 되면 money > 8000 조건식이 무의미해지기 떄문이다.


        }
    }
}

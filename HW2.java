public class HW2 {
    public static void main(String[] args) {

        //받은 돈
        int money = 10000;
        //상품의 총액
        int price = 7500;

        System.out.println("받은 돈 : " + money);
        System.out.println("상품의 총액 : " + price);

        //부가세 수식 완성
        double vat = price * 0.1;
        //잔돈 수식 완성
        double balance = money - price - vat;

        System.out.println("부가세 : " + vat);
        System.out.println("잔돈 : " + balance);
    }
}

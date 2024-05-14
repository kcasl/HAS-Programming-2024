import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 35;

        while(true) {
            System.out.print("1-50 숫자를 입력하세요 : ");
            int x = sc.nextInt();

            if (checkNum(num, x)) {
                System.out.println("맞았습니다.");
                break;
            }
            else{
                if (num < x) {
                    System.out.println("틀렸습니다. DOWN!");
                }
                else {
                    System.out.println("틀렸습니다. UP!");
                }
            }
        }
    }

    public static boolean checkNum(int num, int x) {
        return (num == x);
    }
}

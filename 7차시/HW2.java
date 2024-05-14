import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (true) {
            System.out.print("정수를 입력하세요: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            } else {
                break;
            }
        }
        printTimes(x);
    }
    public static void printTimes(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}

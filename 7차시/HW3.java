import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int x = getInput();
        printTimes(x);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(true) {
            System.out.print("정수를 입력하세요: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            } else {
                break;
            }
        }
        return x;
    }
    public static void printTimes(int n) {
        int e = (n < 9) ? 10: n+1;
        for (int i = 1; i < e; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}

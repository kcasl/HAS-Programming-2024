import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println("입력된 정수 " + x + "의 절대값은 " + abs(x));
    }

    public static int abs(int n) {
        if (n < 0) {
            return (-1) * n;
        }
        else {
            return n;
        }
    }
}

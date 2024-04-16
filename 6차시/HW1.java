import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 단을 출력할까요? ");
        int dan = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);

        }
    }
}

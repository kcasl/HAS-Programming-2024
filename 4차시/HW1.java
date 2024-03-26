public class HW1 {
    public static void main(String[] args) {
        double x = -100;
        double y = 0;

        if (x <= 0) {
            y = (x * x * x) - (9 * x) + 2;
        }
        else
            y = (7 * x) + 2;

        System.out.println("x = " + x);
        System.out.println("f(x) = " + y);



    }
}

public class HW3_4 {
    public static void main(String[] args) {
        int i;
        double f;

        f = 5 / 4;
        System.out.println(f);
        // 5 / 4 (정수 / 정수)의 값인 1을 double 자료형인 f에 대입했기에 1.0 출력.

        f = (double) 5 / 4;
        System.out.println(f);
        /* 실수 5 / 정수 4 -> 바이트 크기 고려 시 4바이트인 int가 8바이트인 double
        자동 형변환 되기에 실수 5 / 실수 4 -> 1.25가 나오게 됨.
        */

        f = 5 / (double) 4;
        System.out.println(f);
        // 위와 마찬가지

        f = (double) 5 / (double) 4;
        System.out.println(f);
        // 실수 5 / 실수 4 -> 1.25

        f = (double) (5 / 4);
        System.out.println(f);
        // 괄호가 먼저 계산되어 정수 5 / 정수 4 의 값인 1을 실수로 형변환. -> 1.0


        i = (int)1.3 + (int)2.8;
        System.out.println(i);
        // 실수 -> 정수 형변환시 소수점 모두 드롭. 1 + 2 = 3

    }
}

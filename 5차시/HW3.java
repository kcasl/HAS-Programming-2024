public class HW3 {
    public static void main(String[] args) {
    // 정수형 변수(n) 선언 및 초기화
        int n = 20;

    // 필요시 변수 추가 선언 및 초기화 가능. 4개 이상 변수 선언 불가
        int i = 2;
        int j = 2;

    // 반복문(while)을 활용하여 2 ~ n까지 소수(Prime Number) 출력
        while (i < n) {
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

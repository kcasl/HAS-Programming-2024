public class HW4 {
    public static void main(String[] args) {
    // 정수형 변수(i) 선언 및 초기화
    // 필요시 변수 추가 선언 및 초기화 가능. 3개 이상 변수 선언 불가
        int i = 1;
        int j = 1;

    // 중첩 반복문(while)을 활용하여 1 ~ 6까지 선언
        while (i < 7) {
            j = 1;
            while (j < 7) {
                if (i == j) {
                    System.out.print(2*i);
                }
                else {
                    System.out.print("-");
                }
                if (j == 6) {
                    System.out.print("\n");
                }
                j++;
            }
            i++;
        }
    }
}

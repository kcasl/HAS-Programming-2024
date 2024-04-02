public class HW2 {
    public static void main(String[] args) {
    // 정수형 변수(n) 선언 및 초기화
        int n = 20;
    // 필요시 변수 추가 선언 및 초기화 가능. 3개 이상 변수 선언 불가
        int i = 1;

        System.out.println("정수 1부터 " + n + "까지의 짝수를 출력합니다.");

        // 반복문(while) 활용하여 결과 출력
        while (i < n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

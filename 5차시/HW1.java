public class HW1 {
    public static void main(String[] args) {
    // 정수형 변수(dan) 선언 및 초기화
        int dan = 9;
    // 필요시 변수 추가 선언 및 초기화 가능. 3개 이상 변수 선언 불가
        int i = 1;
    // 반복문(while) 활용하여 구구단 완성
        while (i<10) {
            System.out.println(dan + " * " + i + " = " + dan*i);
            i++;
        }
    }
}

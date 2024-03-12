public class HW3 {
    public static void main(String[] args) {

        int radius = 10;
        int height = 100;

        double pi = 3.141592;
        double volume_1 = (radius * radius * height) * pi; // 10000 x 3.14...
        double volume_2 = (radius * radius * pi) * height; // 100 x 3.14... x 100

        System.out.println("원기둥의 반지름 : " + radius);
        System.out.println("원기둥의 높이 : " + height);

        System.out.println("원기둥의 부피 1 : " + volume_1);
        System.out.println("원기둥의 부피 2 : " + volume_2);
    }
}

// 애초에 실수가 정확하게 표현될 수 없기음. 부동소수점 방식 -> 최대한 가깝게 근사하는 방식
// but, 결국 같은 값인데 계산결과가 다름. -> 한번에 큰 값을 곱했기에 지수부에 오류가 발생. 10 x 10 .. 처럼 점차적으로 계산하는 것 보다 오차가 큼
// 그렇기에 두 값이 다르게 표현되는 것.
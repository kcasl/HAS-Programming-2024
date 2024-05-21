public class HW1 {

    public static void main(String[] args) {
        // 매개변수가 없는 생성자
        Plane1 p1 = new Plane1();
        // 매개변수가 있는 생성자
        Plane1 p2 = new Plane1(123456, "보잉737", 30);

        System.out.println("디폴트 비행기의 정보입니다.");
        System.out.println(p1.toString());
        System.out.println("제주행 비행기의 정보입니다.");
        System.out.println(p2.toString());
    }
}

class Plane1 {

    String model;
    int id;
    int capacity;

    public Plane1() {
        model = "모름";
        id = 0;
        capacity = 0;
    }
    public Plane1(int i, String m, int c) {
        model = m;
        id = i;
        capacity = c;
    }

    public String toString() {
        String rslt = "";
        rslt += "식별변호: " + id + "편\n";
        rslt += "모델: " + model + "\n";
        rslt += "승객수: " + capacity + "명\n";

        return rslt;
    }
}
public class HW2 {
    public static void main(String[] args) {
        Plane2 p1 = new Plane2();
        Plane2 p2 = new Plane2(123456, "보잉737", 30);
        Plane2 p3 = new Plane2(7891011, "보잉737", 230);

        System.out.println("디폴트 비행기의 정보입니다.");
        System.out.println(p1.toString());

        System.out.println("제주행 비행기의 정보입니다.");
        // 객체 이용 없이 후위증가연산자를 이용해 증가시킴
        Plane2.planes++;

        System.out.println("현재까지 추가된 항공편은 " + Plane2.planes + "대 입니다.");
        System.out.println(p2.toString());

        System.out.println("뉴욕행 비행기의 정보입니다.");
        // 객체 이용 없이 후위증가연산자를 이용해 증가시킴
        Plane2.planes++;

        System.out.println("현재까지 추가된 항공편은 " + Plane2.planes + "대 입니다.");
        System.out.println(p3.toString());
    }
}

class Plane2 {

    String model;
    int id;
    int capacity;
    static int planes = 0;

    public Plane2() {
        model = "모름";
        id = 0;
        capacity = 0;
    }
    public Plane2(int i, String m, int c) {
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
public class HW1 {
    public static void main(String[] args) {
        System.out.println("디폴트 비행기의 정보입니다.");
        Plane p1 = new Plane();
        System.out.println(p1.toString());

        System.out.println("제주행 비행기의 정보입니다.");
        Plane p2 = new Plane();

        // 설정자와 접근자를 이용해서 완성
        p2.setId(123456);
        p2.setModel("보잉737");
        p2.setCapacity(30);

        System.out.println(p2.toString());
    }
}

class Plane {
    private int id;
    private String model;
    private int capacity;

    public Plane() {
        this.model = "모름";
        this.id = 0;
        this.capacity = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        String rslt = "";
        rslt += "식별변호: " + this.getId() + "편\n";
        rslt += "모델: " + this.getModel() + "\n";
        rslt += "승객수: " + this.getCapacity() + "명\n";
        return rslt;
    }
}
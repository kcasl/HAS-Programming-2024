public class HW3 {
    public static void main(String[] args) {
        char s = 'a';

        switch (s) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(s + "는 모음입니다.");
                break;
            default:
                System.out.println(s + "는 자음입니다.");
        }
    }
}

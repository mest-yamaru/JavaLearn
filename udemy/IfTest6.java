package udemy;
public class IfTest6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        if (a == 6 || --b == 10) {
            System.out.println("条件成立！");
            System.out.println(b);
        } else {
            System.out.println("条件不成立");
        }
    }
}

public class Exception4 {
    public static void main(String[] args) {
        try {
            Object obj = null;
            System.out.println(obj.toString());
            System.out.println("A");
        } finally {
            System.out.println("B");
        } catch (NullPointerException e) { // try-catch-finallyが正しい順番
            System.out.println("C");
        }
    }
}

public class Exception4Sub {
    public static void main(String[] args) {
        try {
            Object obj = null;
            System.out.println(obj.toString());
            System.out.println("A");
        } catch (NullPointerException e) { // try-catch-finallyが正しい順番
            System.out.println("C");
        } finally {
            System.out.println("B");
        }
    }
}

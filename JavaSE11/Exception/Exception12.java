public class Exception12 {
    public static void main(String[] args) {
        try {
            sample();
        } catch (StackOverflowError e) {
            // 何らかの例外処理
        }
        System.out.println("finish");
    }
    private static void sample() {
        sample();
    }
}

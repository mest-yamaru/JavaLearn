public class Api {
    public static void main(String[] args) {
        System.out.println("複利20年後");
        System.out.println((40 * (Math.pow(( 1 + 0.04 ), 20) - 1) / 0.04 ));
        System.out.println("複利30年後");
        System.out.println((40 * (Math.pow(( 1 + 0.04 ), 30) - 1) / 0.04 ));
        System.out.println("複利40年後");
        System.out.println((40 * (Math.pow(( 1 + 0.04 ), 40) - 1) / 0.04 ));
    }
}

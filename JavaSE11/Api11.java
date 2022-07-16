import java.util.Arrays;

public class Api11 {
    public static void main(String[] args) {
        String[] a = {"B", "A"};
        String[] b = {"A", "B"};
        System.out.println(Arrays.compare(a, b));
        // 引数で受け取った２つの配列が等しい場合は0を戻す
        // 第1引数の方が先なら負の値、第2引数の方が先なら正の値を戻す
    }
}

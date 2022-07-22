import java.util.Arrays;

public class Api10 {
    public static void main(String[] args) {
        String[] a = {"b", "c"};
        String[] b = {"a", "b", "c"};
        System.out.println(Arrays.mismatch(a, b)); //合わないインデックス番号の手前のインデックスの数字を戻す
    }
}

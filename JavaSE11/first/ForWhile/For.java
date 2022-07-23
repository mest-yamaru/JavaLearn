public class For {
    public static void main(String[] args) {
        int a = 1;
        for (int b = 2, total = 0; b <= 5; b++) {
            total = a * b;
            System.out.println(total);
        }
        // System.out.println(total); ブロック外で変数totalを使用するとコンパイルエラーとなる
    }
}

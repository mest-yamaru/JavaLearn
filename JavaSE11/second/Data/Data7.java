public class Data7 {
    public void test(var value) {  //引数の方宣言に型推論は使えない（コンパイルエラー）
        System.out.println(value);
    }
}

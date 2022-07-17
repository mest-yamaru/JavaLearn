public class Exception3 {
    public static void main(String[] args) {
        try {
            sample();
            sub();
        } catch (SampleException3 e) {
            System.out.println("A");
        } catch (SubSumpleException3 e) { //一つ目のcatchブロックはこのインスタンスへの参照をスーパークラスであるSampleException型で受け取ることが可能。
            // そのため例外処理があったと判断され、二つ目のcatchブロックが実行されない。到達しないコードを記述するとコンパイルエラーとなる。
            System.out.println("B");
        }
    }

    private static void sample() throws SumpleException3 {
        throw new SumpleException3();
    }+

    private static void sub()throws SubSampleException3 {
        throw new SubSampleExcetion3();
    }
}

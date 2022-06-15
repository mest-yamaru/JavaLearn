public class ForTest {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            // int n = i + 1;
            // System.out.println("繰り返し:" + n + "周目");
            System.out.println("繰り返し:" + i + "周目");
            if (i == 5) {
                break; //ループを中断する
            }
        }
    }
}

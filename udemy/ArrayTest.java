package udemy;
public class ArrayTest {
    public static void main(String[] args) {
        String name = "鈴木太郎";
        String email = "suzuki_taro@xxxx.com";
        String phone = "090-0000-9999";
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);

        System.out.println();

        String[] customer; // String型の配列を宣言
        customer = new String[3]; // 要素の情報のかたまりを代入。要素の上限も決める。
        customer[0] = "鈴木";
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";
        // System.out.println(customer[0]);
        // System.out.println(customer[2]);
        // System.out.println(customer[1]);
        // 通常のforループのパターン
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i]);
        }

        System.out.println();

        // String[] customer2;
        // customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"}; // {で初期化する場合、宣言と初期化を分けられる}

        // String[] customer2;
        // customer2 = new String[]{"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"}; // new 型名[]{}で初期化する場合、宣言と初期化を分けられる

        String[] customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"}; // new 型名[]{}で初期化する場合、宣言と初期化を同時に行う
        System.out.println(customer2[0]);
        System.out.println(customer2[2]);
        System.out.println(customer2[1]);

        System.out.println();

        // 拡張for文のパターン
        String[] customer3 = {"山本和也", "yamamoto@xxxx.com", "090-0000-9999"}; // new 型名[]{}で初期化する場合、宣言と初期化を同時に行う
        for(String info : customer3) {
            System.out.println(info);
        }
    }
}

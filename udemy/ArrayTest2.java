public class ArrayTest2 {
    public static void main(String[] args) {
        int a = 1;
        // String[] customer; // String型の配列を宣言
        // customer = new String[3]; // 要素の情報のかたまりを代入。要素の上限も決める。
        // switch(a) {
        //     case 1:
        //         customer[0] = "鈴木太郎";
        //         customer[1] = "suzuki_taro@xxxx.com";
        //         customer[2] = "090-0000-9999";
        //         break;
        //     case 2:
        //         customer[0] = "鈴木太郎";
        //         customer[1] = "suzuki_taro@xxxx.com";
        //         break;
        //     case 3:
        //         customer[0] = "鈴木太郎";
        //         break;
        // }

        // String[] customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
        String[] customer2;
        switch(a) {
            case 1:
                customer2 = new String[] {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
                break;
            case 2:
                customer2 = new String[] {"鈴木太郎", "suzuki_taro@xxxx.com"};
                break;
            default:
                customer2 = new String[] {"鈴木太郎"};
                break;
        }
        
        // 通常のforループのパターン
        // for (int i = 0; i < customer2.length; i++) {
        //     if (customer2[i] != null) {
        //         System.out.println(customer2[i]);
        //     }
        // }

        // 拡張for文のパターン
        for (String customer2Value : customer2 ) {
            System.out.println(customer2Value);
        }

        // System.out.println();

        // // 拡張for文のパターン
        // String[] customer3 = {"山本和也", "yamamoto@xxxx.com", "090-0000-9999"}; // new 型名[]{}で初期化する場合、宣言と初期化を同時に行う
        // for(String info : customer3) {
        //     System.out.println(info);
        // }
    }
}

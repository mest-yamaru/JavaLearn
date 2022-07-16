import java.util.ArrayList;

public class Api7 {
    public static void main(String[] args) {
        ArrayList<Api7Item> list = new ArrayList<>();
        list.add(new Api7Item("A", 100));
        list.add(new Api7Item("B", 200));
        list.add(new Api7Item("C", 300));
        list.add(new Api7Item("A", 100));
        list.remove(new Api7Item("A", 500)); //名前一致で削除するが複数ある場合は最初の一個だけ削除
        for (Api7Item item : list) {
            System.out.println(item.getName());
        }
    }
}

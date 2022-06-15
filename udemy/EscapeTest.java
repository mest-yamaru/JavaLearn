package udemy;
public class EscapeTest {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        System.out.println("Double quote(\") is displayed.");  // バックスラッシュでエスケープする
        char c = '\'';
        System.out.println(c);
        System.out.println("\\ is displayed.");  // バックスラッシュでエスケープする
        
        String str = "Hello!\n World!!";  // 改行の制御文字\n
        System.out.println("Hello!\t World!!");  // TABの制御文字\t

        boolean test = true;
        if (test == true) {
            str = "Hello!\n World!!";
        } else {
            str = "Hello!\t World!!";
        }
        System.out.println(str);

    }
}
import java.io.FileInputStream;
import java.io.FileNoFoundException;

public class Exception10 {
    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream("sample.txt")) {
            throw new FileNotFoundException();
        } catch (Exception e) {
            System.out.println("A");
        } finally {
            if (is != null) {
                is.clone();
            }
            System.out.println("B");  //tryブロックの中で宣言した変数はtryブロック内でしか使えない。
        }
    }
}

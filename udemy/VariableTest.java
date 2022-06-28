public class VariableTest {
    public static void main(String[] args) {
        int myAge;// 変数宣言:情報が入る箱の形を決めて、コンピューターに伝える
        myAge = 35;
        // myAge = 40;
        // myAge += 5;
        System.out.println(myAge);

        int[] ourAges = new int[5];
        System.out.println(ourAges[1] + 5);

        boolean[] isChild = new boolean[5];
        System.out.println(isChild[1]);

        char[] letter = new char[5];
        System.out.println(letter[1]);

        String[] text = new String[5];
        System.out.println(text[1]);
    }
}
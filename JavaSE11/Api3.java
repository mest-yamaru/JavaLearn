public class Api3 {
    public static void main(String[] args) {
        char a = 'a';
        int num = 0;
        if (Character.isAlphabetic(a)) {
            num++;
        }
        if (Character.isDigit(a)) {
            num++;
        }
        if (Character.isLowerCase(a)) {
            num++;
        }
        System.out.println(num);
    }
}

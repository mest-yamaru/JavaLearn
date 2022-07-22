public class array5 {
    public static void main(String[] args) {
        String[][] array = { { "A", "B"}, null, { "C", "D", "E"} };
        int total = 0;
        for (String[] tmp : array) {
            total += tmp.length; //nullが渡され例外がスローされる
        }
        System.out.println(total);
    }
}

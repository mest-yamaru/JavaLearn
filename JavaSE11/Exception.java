public class Exception {
    public static void main(String[] args) {
        try {
            int[] array = {};
            array[0] = 10;
            System.out.println("finish");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }

}

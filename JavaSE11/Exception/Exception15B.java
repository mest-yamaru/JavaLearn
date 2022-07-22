public class Exception15B {
    private int num;
    public Exception15B(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        Exception15B b = (Exception15B) obj;
        return this.num == b.num;
    }
}

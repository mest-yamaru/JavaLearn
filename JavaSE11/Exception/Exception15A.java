public class Exception15A {
    private int num;
    public Exception15A(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        Exception15A a = (Exception15A) obj;
        return this.num == a.num;
    }
}

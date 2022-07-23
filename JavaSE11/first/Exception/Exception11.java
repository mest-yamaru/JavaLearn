public class Exception11 {
    public void hello(String name) throws SampleException11, TestException11 {
        if(name == null) {
            throw new SampleException11(); //謎
        }
        if ("".equals(name)) {
            throw new TestException11();
        }
        // do something
    }
}

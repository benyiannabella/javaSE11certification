import java.io.IOException;

public class TestException {

    class MyReader implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("reader resource was closed");
        }


    }

    class MyWriter implements AutoCloseable{

        @Override
        public void close() throws Exception {
            System.out.println("close writer resource");
        }
    }
    public void read() throws Exception {
        var bookReader = new MyReader();
//        bookReader = null;
        try(bookReader;
            var bookWriter = new MyWriter()){
            System.out.println("read book");
        } finally {
            System.out.println("book was read");
        }
    }

    public static void main(String[] args) {
        TestException t = new TestException();
        try {
            t.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

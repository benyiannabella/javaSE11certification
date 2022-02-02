import java.io.Closeable;
import java.io.IOException;

class MyFileReader implements Closeable{
    private String tag;
    MyFileReader(String tag){
        this.tag = tag;
    }

    public void read(){
        System.out.println("reading");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed " + tag);
    }
}

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try(var bookReader = new MyFileReader("monkey")) {
            System.out.println("Try Block");
        }
        final var bookReader = new MyFileReader("1");
        var tvReader = new MyFileReader("3");
        try (bookReader;
            var movieReader = new MyFileReader("2");
            tvReader;) {
            tvReader.read();
            System.out.println("Try Block");}
//        } finally {
//            tvReadre.read
//        }
    }
}

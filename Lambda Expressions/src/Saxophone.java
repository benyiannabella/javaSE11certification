interface Horn {
//    public Integer play();
}
abstract class Ball {
    protected final int size;
    public Ball(int size) {
        this.size = size;
    }
}

class Woodwind {
    public Woodwind() {
    }

    public Short play() {
        return 3;
    }
}

public final class Saxophone extends Woodwind implements Horn {

    public static void main(String[] args) {
        Woodwind woodwind = new Woodwind();
        Saxophone saxophone = new Saxophone();
        saxophone = (Saxophone) woodwind;
        woodwind = saxophone;
    }
    public Saxophone() {
        super();
    }

//    public Long play() {
//        return null;
//    }
}
public class Squares {
    int length;
    Squares sq;

    public Squares(int length) {
        this.length = length;
        this.getLength();
    }

    void setThisSq(Squares sq){
        this.sq = sq;
    }

    public int getLength(){
        return this.length;
    }

    public void print(){
        System.out.println("test");
    }

    public static void main(String[] args) {
        Squares sq1 = new Squares(10);
        Squares sq2 = new Squares(5);
        sq1.setThisSq(sq2);
        System.out.println(sq1.sq.length);
        sq1=null;
//        sq1.print();

    }

}

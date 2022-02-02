class NoLoad {
    public void bestMethod(int i){
        System.out.println("best method for int");
    }
}

public class NotOverloaded {
    public static void main(String[] args) {
        NoLoad noLoad = new NoLoad();
        noLoad.bestMethod(1);
    }
}
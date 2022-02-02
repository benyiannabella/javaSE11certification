interface Tasks{
    void digHole();
}

public class Anonymous{

    public static void digging(Tasks task){
        task.digHole();
    }

    public static void main(String[] args) {
        Tasks dig = new Tasks() {
            @Override
            public void digHole() {
                System.out.println("I am digging a hole to plant a tree");
            }
        };

        Anonymous.digging(dig);
    }
}

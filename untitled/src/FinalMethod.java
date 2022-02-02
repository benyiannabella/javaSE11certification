abstract class ManySubTypes {
    public abstract void doXYourWay();
    public abstract void doYYourWay();
    public abstract String toString();

    final void doZOnlyOneWay(){
        System.out.println("Z can only be done this way");
    }
}

public class FinalMethod extends ManySubTypes{
    private boolean flag = false;

    public static void main(String[] args) {
        FinalMethod e = new FinalMethod();
        e.doXYourWay();
        e.doYYourWay();
        e.doZOnlyOneWay();
        System.out.println(e);
    }
    @Override
    public void doXYourWay() {
        System.out.println("Implement X my way");
    }

    @Override
    public void doYYourWay() {
        System.out.println("Implement Y my way");
    }

    @Override
    public String toString() {
//        return super.toString();
        return "not implemented yet";
    }


}
